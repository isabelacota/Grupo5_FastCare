package xyz.hidasy.rest;

public class BaseResponse {

    private String statusMessage;
    private int statusId;
    private String authToken;

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
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
