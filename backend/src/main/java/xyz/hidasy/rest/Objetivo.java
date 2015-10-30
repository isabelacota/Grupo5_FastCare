package xyz.hidasy.rest;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class Objetivo extends SoapeModel{

    private Float height;

    private Float weight;

    private Integer cardiacFrequency;

    private Integer systolicArterialPressure;

    private Integer diastolicArterialPressure;

    private String observations;

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getCardiacFrequency() {
        return cardiacFrequency;
    }

    public void setCardiacFrequency(Integer cardiacFrequency) {
        this.cardiacFrequency = cardiacFrequency;
    }

    public Integer getSystolicArterialPressure() {
        return systolicArterialPressure;
    }

    public void setSystolicArterialPressure(Integer systolicArterialPressure) {
        this.systolicArterialPressure = systolicArterialPressure;
    }

    public Integer getDiastolicArterialPressure() {
        return diastolicArterialPressure;
    }

    public void setDiastolicArterialPressure(Integer diastolicArterialPressure) {
        this.diastolicArterialPressure = diastolicArterialPressure;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
