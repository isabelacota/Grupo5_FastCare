package xyz.hidasy.rest;

public class BaseResponse {

    String statusMessage;
    int statusId;
    String authToken;
    
    public String getStatus() {
	return statusMessage;
    }
    
    public void setStatus(String m) {
	this.statusMessage = m;
    }
    
    public int getStatusId() {
	return statusId;
    }
    
    public void setStatusId(int i) {
	this.statusId = i;
    }
    
    @Override
    public String toString() {
	return "TO-DO";
    }
    
}
