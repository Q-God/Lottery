package org.gq.lottery.rpc.req;

import java.io.Serializable;

/**
 *
 */
public class ActivityReq implements Serializable {

    private static final long serialVersionUID = 7852660348967986948L;
    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
