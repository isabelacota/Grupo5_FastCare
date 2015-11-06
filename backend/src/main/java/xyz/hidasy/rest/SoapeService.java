package xyz.hidasy.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
@Path("/appointment")
public class SoapeService {

    @GET
    @Path("{appointmentId}/subjective")
    @Produces(MediaType.APPLICATION_JSON)
    public SubjectiveResponse getSubjective(@PathParam("appointmentId") Long appointmentId) {
        Subjective subjective = Database.getSubjectiveById(appointmentId);
        SubjectiveResponse subjectiveResponse = new SubjectiveResponse();
        subjectiveResponse.setSubjective(subjective);
        if (subjective != null) {
            subjectiveResponse.setStatusId(0);
            subjectiveResponse.setStatusMessage("Subjective found");
        } else {
            subjectiveResponse.setStatusId(1);
            subjectiveResponse.setStatusMessage("Subjective not found");
        }

        return subjectiveResponse;
    }

    @POST
    @Path("{appointmentId}/subjective")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public SubjectiveResponse addSubjective(@PathParam("appointmentId") Long appointmentId,
                                    Subjective subjective) throws SQLException {
        subjective.setAppointmentId(appointmentId);

        SubjectiveResponse subjectiveResponse = new SubjectiveResponse();
        subjectiveResponse.setSubjective(subjective);

        try {
            Database.addSubjective(subjective);
            subjectiveResponse.setStatusId(0);
            subjectiveResponse.setStatusMessage("Subjective inserted");
        } catch (SQLException e) {
            e.printStackTrace();
            subjectiveResponse.setStatusId(1);
            subjectiveResponse.setStatusMessage("Subjective not inserted. Error: " + e.getMessage());
        }

        return subjectiveResponse;
    }

    @GET
    @Path("{appointmentId}/objective")
    @Produces(MediaType.APPLICATION_JSON)
    public ObjectiveResponse getObjective(@PathParam("appointmentId") Long appointmentId) {
        Objective objective = Database.getObjectiveById(appointmentId);
        ObjectiveResponse objectiveResponse = new ObjectiveResponse();
        objectiveResponse.setObjective(objective);
        if (objective != null) {
            objectiveResponse.setStatusId(0);
            objectiveResponse.setStatusMessage("Objective found");
        } else {
            objectiveResponse.setStatusId(1);
            objectiveResponse.setStatusMessage("Objective not found");
        }

        return objectiveResponse;
    }

    @POST
    @Path("{appointmentId}/objective")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ObjectiveResponse addObjective(@PathParam("appointmentId") Long appointmentId,
                                            Objective objective) throws SQLException {
        objective.setAppointmentId(appointmentId);

        ObjectiveResponse objectiveResponse = new ObjectiveResponse();
        objectiveResponse.setObjective(objective);

        try {
            Database.addObjective(objective);
            objectiveResponse.setStatusId(0);
            objectiveResponse.setStatusMessage("Objective inserted");
        } catch (SQLException e) {
            e.printStackTrace();
            objectiveResponse.setStatusId(1);
            objectiveResponse.setStatusMessage("Objective not inserted. Error: " + e.getMessage());
        }

        return objectiveResponse;
    }

    @GET
    @Path("{appointmentId}/diagnosis")
    @Produces(MediaType.APPLICATION_JSON)
    public DiagnosisResponse getDiagnosis(@PathParam("appointmentId") Long appointmentId) {
        Diagnosis diagnosis = null;//Database.getDiagnosisById(appointmentId);
        DiagnosisResponse diagnosisResponse = new DiagnosisResponse();
        diagnosisResponse.setDiagnosis(diagnosis);
        if (diagnosis != null) {
            diagnosisResponse.setStatusId(0);
            diagnosisResponse.setStatusMessage("Diagnosis found");
        } else {
            diagnosisResponse.setStatusId(1);
            diagnosisResponse.setStatusMessage("Diagnosis not found");
        }

        return diagnosisResponse;
    }

    @POST
    @Path("{appointmentId}/diagnosis")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public DiagnosisResponse addDiagnosis(@PathParam("appointmentId") Long appointmentId,
                                          Diagnosis diagnosis) throws SQLException {
        diagnosis.setAppointmentId(appointmentId);

        DiagnosisResponse diagnosisResponse = new DiagnosisResponse();
        diagnosisResponse.setDiagnosis(diagnosis);

        try {
            //Database.addDiagnosis(diagnosis);
            diagnosisResponse.setStatusId(0);
            diagnosisResponse.setStatusMessage("Diagnosis inserted");
        } catch (/*SQL*/Exception e) {
            e.printStackTrace();
            diagnosisResponse.setStatusId(1);
            diagnosisResponse.setStatusMessage("Diagnosis not inserted. Error: " + e.getMessage());
        }

        return diagnosisResponse;
    }

    @GET
    @Path("{appointmentId}/evolution")
    @Produces(MediaType.APPLICATION_JSON)
    public EvolutionResponse getEvolution(@PathParam("appointmentId") Long appointmentId) {
        Evolution evolution = null;//Database.getEvolutionById(appointmentId);
        EvolutionResponse evolutionResponse = new EvolutionResponse();
        evolutionResponse.setEvolution(evolution);
        if (evolution != null) {
            evolutionResponse.setStatusId(0);
            evolutionResponse.setStatusMessage("Evolution found");
        } else {
            evolutionResponse.setStatusId(1);
            evolutionResponse.setStatusMessage("Evolution not found");
        }

        return evolutionResponse;
    }

    @POST
    @Path("{appointmentId}/evolution")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public EvolutionResponse addEvolution(@PathParam("appointmentId") Long appointmentId,
                                          Evolution evolution) throws SQLException {
        evolution.setAppointmentId(appointmentId);

        EvolutionResponse evolutionResponse = new EvolutionResponse();
        evolutionResponse.setEvolution(evolution);

        try {
            //Database.addEvolution(evolution);
            evolutionResponse.setStatusId(0);
            evolutionResponse.setStatusMessage("Evolution inserted");
        } catch (/*SQL*/Exception e) {
            e.printStackTrace();
            evolutionResponse.setStatusId(1);
            evolutionResponse.setStatusMessage("Evolution not inserted. Error: " + e.getMessage());
        }

        return evolutionResponse;
    }

    @GET
    @Path("{appointmentId}/plan")
    @Produces(MediaType.APPLICATION_JSON)
    public PlanResponse getPlan(@PathParam("appointmentId") Long appointmentId) {
        Plan plan = null;//Database.getPlanById(appointmentId);
        PlanResponse planResponse = new PlanResponse();
        planResponse.setPlan(plan);
        if (plan != null) {
            planResponse.setStatusId(0);
            planResponse.setStatusMessage("Plan found");
        } else {
            planResponse.setStatusId(1);
            planResponse.setStatusMessage("Plan not found");
        }

        return planResponse;
    }

    @POST
    @Path("{appointmentId}/plan")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PlanResponse addPlan(@PathParam("appointmentId") Long appointmentId,
                                          Plan plan) throws SQLException {
        plan.setAppointmentId(appointmentId);

        PlanResponse planResponse = new PlanResponse();
        planResponse.setPlan(plan);

        try {
            //Database.addPlan(plan);
            planResponse.setStatusId(0);
            planResponse.setStatusMessage("Plan inserted");
        } catch (/*SQL*/Exception e) {
            e.printStackTrace();
            planResponse.setStatusId(1);
            planResponse.setStatusMessage("Plan not inserted. Error: " + e.getMessage());
        }

        return planResponse;
    }

    @POST
    @Path("{id}/start")
    public void startAppointment(@PathParam("id") Long appointmentId) {

        //Database.startAppointment(appointmentId);
    }

    @POST
    @Path("{id}/stop")
    public void stopAppointment(@PathParam("id") Long appointmentId) {

        //Database.stopAppointment(appointmentId);
    }

    @GET
    @Path("running")
    public AppointmentResponse getRunningAppointment() {
        AppointmentResponse appointmentResponse = new AppointmentResponse();
        Appointment appointment = null;//Database.findAppointment
        appointmentResponse.setAppointment(appointment);
        if (appointment != null) {
            appointmentResponse.setStatusId(0);
            appointmentResponse.setStatusMessage("Found current appointment");
        } else {
            appointmentResponse.setStatusId(1);
            appointmentResponse.setStatusMessage("No current appointment found");
        }
        return appointmentResponse;
    }

}
