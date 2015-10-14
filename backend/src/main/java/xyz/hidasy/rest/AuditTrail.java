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


import xyz.hidasy.rest.AuditResponse;

@Path("/audit")
public class AuditTrail {
	
    @GET
    //@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public AuditResponse getAudit(@GetParam("id") String id) {
	//Assuming doctor is logged in
	AuditResponse r = new AuditResponse();
	pr.setStatus("Resposta");
	pr.setStatusId(3);
	return r;	
    }

    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    @Path("/update")
    public Response updatePacient(@PostParam("data") AuditResponse r) {
	
	return Response.status(200).entity(output).build();
    }
    
    
}
