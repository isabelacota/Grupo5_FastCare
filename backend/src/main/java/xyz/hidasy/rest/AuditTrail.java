package xyz.hidasy.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;

//@Path("/audit")
public class AuditTrail {
	
    //@GET
    //@Path("/{id}")
    //@Produces(MediaType.APPLICATION_JSON)
    public AuditResponse getAudit(@QueryParam("id") String id) {
        //Assuming doctor is logged in
        AuditResponse r = new AuditResponse();
        r.setStatusMessage("Resposta");
        r.setStatusId(3);
        return r;
    }

//    @Consumes(MediaType.APPLICATION_JSON)
//    @POST
//    @Path("/update")
    public Response updatePacient(@QueryParam("data") AuditResponse r) {
	
	    return Response.status(200).entity(r).build();
    }
    
    
}
