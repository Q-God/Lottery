package org.gq.lottery.rpc.res;

import org.gq.lottery.rpc.dto.ActivityDto;

import javax.xml.transform.Result;
import java.io.Serializable;

public class ActivityRes implements Serializable {
    private static final long serialVersionUID = -1175220069678009142L;

    private Result result;

    private ActivityDto activity;

    public ActivityRes() {
        this(null, null);
    }

    public ActivityRes(Result result) {
        this(result, null);
    }

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivity() {
        return activity;
    }

    public void setActivity(ActivityDto activity) {
        this.activity = activity;
    }
}
