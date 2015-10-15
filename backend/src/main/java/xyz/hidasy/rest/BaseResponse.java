package xyz.hidasy.rest;

public class BaseResponse {

    private String statusMessage;
    private int statusId;
    private String authToken;
    
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

    public String getToken() {
	return authToken;
    }

    public void setToken(String token) {
	this.authToken = token;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "statusMessage='" + statusMessage + '\'' +
                ", statusId=" + statusId +
                ", authToken='" + authToken + '\'' +
                '}';
    }
}
