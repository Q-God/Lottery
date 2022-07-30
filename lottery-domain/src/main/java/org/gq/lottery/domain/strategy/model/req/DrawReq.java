package org.gq.lottery.domain.strategy.model.req;

public class DrawReq {

    //用户id
    private String uId;

    //策略id
    private Long steategyId;

    public DrawReq() {
    }

    public DrawReq(String uId, Long steategyId) {
        this.uId = uId;
        this.steategyId = steategyId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getSteategyId() {
        return steategyId;
    }

    public void setSteategyId(Long steategyId) {
        this.steategyId = steategyId;
    }
}
