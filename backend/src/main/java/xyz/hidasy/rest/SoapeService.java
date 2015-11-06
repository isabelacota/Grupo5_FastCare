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

    /*@GET
    @Path("patient/{patientId}/appointment/{appointmentId}/objective")
    @Produces(MediaType.APPLICATION_JSON)
    public SubjectiveResponse getObjective(@PathParam("patientId") Long patientId,
                                            @PathParam("appointmentId") Long appointmentId) {
        Objective objective = Database.getObjectiveById(appointmentId);
        ObjectiveResponse subjectiveResponse = new SubjectiveResponse();
        subjectiveResponse.setSubjective(objective);
        if (objective != null) {
            subjectiveResponse.setStatusId(0);
            subjectiveResponse.setStatusMessage("Subjective found");
        } else {
            subjectiveResponse.setStatusId(1);
            subjectiveResponse.setStatusMessage("Subjective not found");
        }

        return subjectiveResponse;
    }

    @POST
    @Path("patient/{patientId}/appointment/{appointmentId}/subjective")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public SubjectiveResponse addSubjective(@PathParam("patientId") Long patientId,
                                            @PathParam("appointmentId") Long appointmentId,
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
    }*/

}
