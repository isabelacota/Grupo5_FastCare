package xyz.hidasy.rest;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class ObjectiveResponse extends BaseResponse {

    private Objective objective;

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }
}
