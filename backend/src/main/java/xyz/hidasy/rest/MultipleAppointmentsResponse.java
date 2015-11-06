package xyz.hidasy.rest;

import java.util.List;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class MultipleAppointmentsResponse extends BaseResponse {

    private List<Appointment> appointments;

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
