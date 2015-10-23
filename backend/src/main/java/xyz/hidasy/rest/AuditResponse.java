package xyz.hidasy.rest;
import java.util.List;


public class AuditResponse extends BaseResponse {

    List<Audit> audits;

    public List<Audit> getAudits() {
	return audits;
    }

    public void setAudits(List <Audit> a) {
	this.audits = a;
	return;
    }
    
    @Override
    public String toString() {
	return "TO-DO";
    }
    
}
