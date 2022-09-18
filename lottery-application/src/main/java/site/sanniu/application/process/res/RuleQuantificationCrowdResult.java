package site.sanniu.application.process.res;

import site.sanniu.common.Result;

/**
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
public class RuleQuantificationCrowdResult extends Result {

    /** 活动ID */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}

