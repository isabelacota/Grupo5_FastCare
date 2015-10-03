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

import xyz.hidasy.rest.Pacient;

@Path("/pacient")
public class HelloWorldService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pacient getPacient(@PathParam("id") String msg) {

	Pacient pacient = new Pacient();
	pacient.setName("Enter Sandman");
	pacient.setId(msg);
	

	return pacient;
	
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
