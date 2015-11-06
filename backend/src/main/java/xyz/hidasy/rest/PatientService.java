package xyz.hidasy.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

@Path("/")
public class PatientService {
	
    @GET
    @Path("patient/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PatientResponse getPatient(@PathParam("id") Long id) {
        //Assuming doctor is logged in
        PatientResponse pr = new PatientResponse();
        pr.setStatusMessage("Resposta");
        pr.setStatusId(3);
	Database.insertAudit("Medico","Requested patient");

        pr.setPatient(Database.getPatientById(id));
        return pr;
    }

    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    @Path("patient/{id}/update")
    public Response updatePatient(@PathParam("id") String msg) {

	    String output = "{[update]}";

	    return Response.status(200).entity(output).build();
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
    @Path("patient/insert")
    @Produces(MediaType.APPLICATION_JSON)
    public PatientResponse insertPatient(Patient patient) {
        PatientResponse patientResponse = new PatientResponse();
        patientResponse.setStatusMessage("Erro desconhecido ao inserir paciente");
        patientResponse.setStatusId(-1);

        if (CpfValidator.validaCPF(patient.getCpf())) {
            patient.setId(System.currentTimeMillis());
            patient.setCreatedAt(System.currentTimeMillis());
            try {
                Database.insertPatient(patient);
                patientResponse.setPatient(patient);
                patientResponse.setStatusId(0);
		patientResponse.setStatusMessage("Paciente inserido com sucesso");
		Database.insertAudit("Medico","Created patient "+patient.getId());
	    } catch (SQLException e) {
                if (e.getErrorCode() == 0) {
                    patientResponse.setStatusId(2);
                    if (e.getMessage().contains("CPF")) {
                        patientResponse.setStatusMessage("CPF já existente!");
                    } else if (e.getMessage().contains("NAME")) {
                        patientResponse.setStatusMessage("Nome já existente!");
                    }
                }
            }
        } else {
            patientResponse.setStatusId(1);
            patientResponse.setStatusMessage("CPF com formato inválido");
        }

	    return patientResponse;
	}

    @GET
    @Path("patient/filter")
    @Produces(MediaType.APPLICATION_JSON)
    public MultiplePatientsResponse filterPatients(@QueryParam("filter") String filter) {
        MultiplePatientsResponse multiplePatientsResponse = new MultiplePatientsResponse();
        multiplePatientsResponse.setStatusMessage("Erro desconhecido ao filtrar pacientes");
        multiplePatientsResponse.setStatusId(-1);
	Database.insertAudit("Medico","Searched patients as "+filter);

        List<Patient> patients = Database.filterPatients(filter);
        if (patients != null) {
            if (patients.size() >= 1) {
                multiplePatientsResponse.setStatusId(0);
                multiplePatientsResponse.setStatusMessage("Pacientes recuperados com sucesso");
                multiplePatientsResponse.setPatients(patients);
            } else {
                multiplePatientsResponse.setStatusId(1);
                multiplePatientsResponse.setStatusMessage("Nenhum paciente foi encontrado para esse filtro");
            }
        }

        return multiplePatientsResponse;
    }

    @POST
    @Path("patient/{id}/create_appointment")
    @Produces(MediaType.APPLICATION_JSON)
    public AppointmentResponse createAppointment(@PathParam("id") Long patientId) {
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(System.currentTimeMillis() / 10000);
        appointment.setPatientId(patientId);
        appointment.setRunning(false);
        appointment.setCreatedAt(System.currentTimeMillis());

        AppointmentResponse appointmentResponse = new AppointmentResponse();
        appointmentResponse.setAppointment(appointment);

        try {
            // Database.createAppointment
            appointmentResponse.setStatusId(0);
            appointmentResponse.setStatusMessage("Appointed created");
        } catch (/*SQL*/Exception e) {
            appointmentResponse.setStatusId(0);
            appointmentResponse.setStatusMessage("Appointed not created. Error: " + e.getMessage());
        }

        return appointmentResponse;
    }

    @GET
    @Path("patient/{id}/appointments")
    @Produces(MediaType.APPLICATION_JSON)
    public MultipleAppointmentsResponse retrieveAppointments(@PathParam("id") Long patientId) {
        List<Appointment> appointments = null; // Database.getAppointments

        MultipleAppointmentsResponse multipleAppointmentsResponse = new MultipleAppointmentsResponse();
        multipleAppointmentsResponse.setAppointments(appointments);
        if (appointments != null) {
            multipleAppointmentsResponse.setStatusId(0);
            multipleAppointmentsResponse.setStatusMessage("Appointments filtered");
        } else {
            multipleAppointmentsResponse.setStatusId(0);
            multipleAppointmentsResponse.setStatusMessage("Appointments NOT filtered");
        }

        return multipleAppointmentsResponse;
    }
}
