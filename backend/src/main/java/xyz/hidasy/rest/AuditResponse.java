package xyz.hidasy.rest;

import xyz.hidasy.rest.BaseResponse;
import xyz.hidasy.rest.Patient;

public class AuditResponse extends BaseResponse{

    Audit A;
    AuditResponse() {
	A = new Audit();
    }
    public Audit getAudit() {
	return A;
    }

    public void setAudit(Audit a) {
	this.A = a;
	return;
    }
    
    @Override
    public String toString() {
	return "TO-DO";
    }
    
}
