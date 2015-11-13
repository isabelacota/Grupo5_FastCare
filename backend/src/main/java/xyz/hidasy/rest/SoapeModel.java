package xyz.hidasy.rest;

import java.util.Date;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class SoapeModel {

    protected Long appointmentId;

    protected String lastUpdatedAt;

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
}
