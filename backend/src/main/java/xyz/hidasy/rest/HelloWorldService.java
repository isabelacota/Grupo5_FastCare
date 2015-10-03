package xyz.hidasy.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
 
@Path("/paciente")
public class HelloWorldService {

    @GET
    @Path("/{id}")
    public Response getPacient(@PathParam("id") String msg) {
	
	String output = "{\"status_message\": \"bla\"}";
	
	return Response.status(200).entity(output).build();
    }
    
    @POST
    @Path("/{id}/update")
    public Response updatePacient(@PathParam("id") String msg) {
	
	String output = "{[update]}";
	
	return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/insert")
    public Response updatePacient() {
	
	String output = "{[insert]}";
	return Response.status(200).entity(output).build();
    }
}
