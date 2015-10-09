package xyz.hidasy.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;

import xyz.hidasy.rest.Patient;
import xyz.hidasy.rest.PatientResponse;

@Path("/patient")
public class HelloWorldService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PatientResponse getPacient(@PathParam("id") String msg) {

	PatientResponse pr = new PatientResponse();
	pr.setStatus("Resposta");
	pr.setStatusId(3);
	pr.getPatient().setName("Enter Sandman");
	pr.getPatient().setId(msg);
	

	return pr;
	
	//String output = "{\"status_message\": \"bla\"}";
	
	//return Response.status(200).entity(output).build();
    }

    //@Consumes(MediaType.APPLICATION_JSON)

    @POST
    @Path("/{id}/update")
    public Response updatePacient(@PathParam("id") String msg) {
	
	String output = "{[update]}";
	
	return Response.status(200).entity(output).build();
    }
    
    //@Consumes(MediaType.APPLICATION_JSON)
    @POST
    @Path("/insert")
    public Response updatePacient() {
	
	String output = "{[insert]}";
	return Response.status(200).entity(output).build();
    }
}