package xyz.hidasy.rest;

import java.util.Date;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class SoapeModel {

    protected Integer appointmentId;

    protected Date lastUpdatedAt;

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }
}
