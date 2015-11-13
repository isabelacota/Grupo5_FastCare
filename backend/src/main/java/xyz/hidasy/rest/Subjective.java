package xyz.hidasy.rest;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */

public class Subjective extends SoapeModel{

    private String mainComplaint;

    private String story;

    private String renal;

    private String syptomaticInterrogation;

    private String personalAndFamily;

    private String lifeStyleAndSocioeconomic;

    private String orthoticsAndProsthetics;

    private String comments;

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

    public String getSyptomaticInterrogation() {
        return syptomaticInterrogation;
    }

    public void setSyptomaticInterrogation(String syptomaticInterrogation) {
        this.syptomaticInterrogation = syptomaticInterrogation;
    }

    public String getPersonalAndFamily() {
        return personalAndFamily;
    }

    public void setPersonalAndFamily(String personalAndFamily) {
        this.personalAndFamily = personalAndFamily;
    }

    public String getLifeStyleAndSocioeconomic() {
        return lifeStyleAndSocioeconomic;
    }

    public void setLifeStyleAndSocioeconomic(String lifeStyleAndSocioeconomic) {
        this.lifeStyleAndSocioeconomic = lifeStyleAndSocioeconomic;
    }

    public String getOrthoticsAndProsthetics() {
        return orthoticsAndProsthetics;
    }

    public void setOrthoticsAndProsthetics(String orthoticsAndProsthetics) {
        this.orthoticsAndProsthetics = orthoticsAndProsthetics;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Subjective{" +
                "mainComplaint='" + mainComplaint + '\'' +
                ", story='" + story + '\'' +
                ", renal='" + renal + '\'' +
                ", syptomaticInterrogation='" + syptomaticInterrogation + '\'' +
                ", personalAndFamily='" + personalAndFamily + '\'' +
                ", lifeStyleAndSocioeconomic='" + lifeStyleAndSocioeconomic + '\'' +
                ", orthoticsAndProsthetics='" + orthoticsAndProsthetics + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
