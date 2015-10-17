package xyz.hidasy.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/audit")
public class AuditService {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AuditResponse getAudit() {
        AuditResponse ar = new AuditResponse();
        ar.setStatusMessage("Trilha vazia");
        ar.setStatusId(-1);

        List<Audit> audits = Database.getAuditLog();
        if (audits != null) {
            if (audits.size() >= 1) {
                ar.setStatusId(0);
                ar.setStatusMessage("Trilha recuperada com sucesso");
                ar.setAudits(audits);
            } else {
                ar.setStatusId(1);
                ar.setStatusMessage("Problemas com a trilha de auditoria");
            }
        }

        return ar;
    }
}
