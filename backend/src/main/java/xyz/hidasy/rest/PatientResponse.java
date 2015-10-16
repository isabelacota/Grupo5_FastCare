package xyz.hidasy.rest;

public class PatientResponse extends BaseResponse{

    private Patient patient;

    public PatientResponse() {
	    patient = new Patient();
    }
    public Patient getPatient() {
	return patient;
    }

    public void setPatient(Patient p) {
	    this.patient = p;
    }

    @Override
    public String toString() {
        return "PatientResponse{" +
                "patient=" + patient +
                ", status=" + getStatusMessage() +
                ", statusId" + getStatusId() +
                '}';
    }
}
