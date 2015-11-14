package xyz.hidasy.rest;

import java.util.List;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class Diagnosis extends SoapeModel {

    private List<String> diagnosis;

    private String observations;

    private String permanent;

    public String getPermanent() {
        return permanent;
    }

    public void setPermanent(String permanent) {
        this.permanent = permanent;
    }

    public List<String> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(List<String> diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
