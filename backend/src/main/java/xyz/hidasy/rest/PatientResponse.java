package xyz.hidasy.rest;

import xyz.hidasy.rest.BaseResponse;
import xyz.hidasy.rest.Patient;

public class PatientResponse extends BaseResponse{

    Patient P;
    PatientResponse() {
	P = new Patient();
    }
    public Patient getPatient() {
	return P;
    }

    public void setPatient(Patient p) {
	this.P = p;
	return;
    }
    
    @Override
    public String toString() {
	return "TO-DO";
    }
    
}
