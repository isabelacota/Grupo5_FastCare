package xyz.hidasy.rest;

import java.util.List;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class MultiplePatientsResponse extends BaseResponse {

    private List<Patient> patients;

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "MultiplePatientsResponse{" +
                "patients=" + patients +
                '}';
    }
}
