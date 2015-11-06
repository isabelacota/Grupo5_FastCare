package xyz.hidasy.rest;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class SubjectiveResponse extends BaseResponse {

    private Subjective subjective;

    public Subjective getSubjective() {
        return subjective;
    }

    public void setSubjective(Subjective subjective) {
        this.subjective = subjective;
    }
}
