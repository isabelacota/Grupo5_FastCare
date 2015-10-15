package xyz.hidasy.rest;

public class AuditResponse extends BaseResponse {

    Audit A;
    public AuditResponse() {
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
