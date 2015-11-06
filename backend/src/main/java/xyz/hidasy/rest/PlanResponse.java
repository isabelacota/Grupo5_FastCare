package xyz.hidasy.rest;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class PlanResponse extends BaseResponse {

    private Plan plan;

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
