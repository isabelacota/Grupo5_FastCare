package xyz.hidasy.rest;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class Evolution extends SoapeModel {

    private String evolution;

    private String comments;

    public String getEvolution() {
        return evolution;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
