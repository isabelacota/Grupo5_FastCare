package xyz.hidasy.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class PatientService {
	
    @GET
    @Path("patient/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PatientResponse getPatient(@PathParam("id") Integer id) {
        //Assuming doctor is logged in
        PatientResponse pr = new PatientResponse();
        pr.setStatus("Resposta");
        pr.setStatusId(3);

        PatientCRUD db = new PatientCRUD(id);
        pr.setPatient(db.get());
        return pr;
    }

    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    @Path("patient/{id}/update")
    public Response updatePacient(@PathParam("id") String msg) {

	    String output = "{[update]}";

	    return Response.status(200).entity(output).build();
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
    @Path("patient/insert")
    public Response insertPatient() {

	    String output = "{[insert]}";
	    return Response.status(200).entity(output).build();
	}
}
