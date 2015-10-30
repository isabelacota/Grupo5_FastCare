package xyz.hidasy.rest;

import java.util.Date;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class Subjective {

    private Integer appointmentId;

    private String mainComplaint;

    private String story;

    private String renal;

    private String reumatism;

    private String cardiac;

    private String pulmonar;

    private String gastric;

    private String alergies;

    private Boolean hepatite;

    private Boolean pregnancy;

    private Boolean diabetes;

    private Boolean scars;

    private String onDrugs;

    private Date lastUpdatedAt;

    public String getMainComplaint() {
        return mainComplaint;
    }

    public void setMainComplaint(String mainComplaint) {
        this.mainComplaint = mainComplaint;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getRenal() {
        return renal;
    }

    public void setRenal(String renal) {
        this.renal = renal;
    }

    public String getReumatism() {
        return reumatism;
    }

    public void setReumatism(String reumatism) {
        this.reumatism = reumatism;
    }

    public String getCardiac() {
        return cardiac;
    }

    public void setCardiac(String cardiac) {
        this.cardiac = cardiac;
    }

    public String getPulmonar() {
        return pulmonar;
    }

    public void setPulmonar(String pulmonar) {
        this.pulmonar = pulmonar;
    }

    public String getGastric() {
        return gastric;
    }

    public void setGastric(String gastric) {
        this.gastric = gastric;
    }

    public String getAlergies() {
        return alergies;
    }

    public void setAlergies(String alergies) {
        this.alergies = alergies;
    }

    public Boolean getHepatite() {
        return hepatite;
    }

    public void setHepatite(Boolean hepatite) {
        this.hepatite = hepatite;
    }

    public Boolean getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(Boolean pregnancy) {
        this.pregnancy = pregnancy;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean getScars() {
        return scars;
    }

    public void setScars(Boolean scars) {
        this.scars = scars;
    }

    public String getOnDrugs() {
        return onDrugs;
    }

    public void setOnDrugs(String onDrugs) {
        this.onDrugs = onDrugs;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public void setData(String data) {
	//Receives json and populate all fields
    }
    @Override
    public String toString() {
        return "Subjetivo{" +
                "appointmentId=" + appointmentId +
                ", mainComplaint='" + mainComplaint + '\'' +
                ", story='" + story + '\'' +
                ", renal='" + renal + '\'' +
                ", reumatism='" + reumatism + '\'' +
                ", cardiac='" + cardiac + '\'' +
                ", pulmonar='" + pulmonar + '\'' +
                ", gastric='" + gastric + '\'' +
                ", alergies='" + alergies + '\'' +
                ", hepatite=" + hepatite +
                ", pregnancy=" + pregnancy +
                ", diabetes=" + diabetes +
                ", scars=" + scars +
                ", onDrugs='" + onDrugs + '\'' +
                ", lastUpdatedAt=" + lastUpdatedAt +
                '}';
    }
}
