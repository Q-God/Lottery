package org.gq.lottery.rpc.dto;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Date;

public class ActivityDto implements Serializable {


    private static final long serialVersionUID = -6889413988823239564L;

    //活动id
    private Long activityId;


    //活动名称
    private String activityName;

    //活动描述
    private String activityDesc;

    //开始时间
    private Date beginDateTime;

    //结束时间
    private Date endDateTime;

    //库存
    private Integer stockCount;

    //每人可以参与次数
    private Integer takeCount;

    // 活动状态：编辑、提审、撤审、通过、运行、拒绝、关闭、开启
    private Integer state;


    private final static class Builder {
        //活动id
        private Long activityId;

        //活动名称
        private String activityName;

        //活动描述
        private String activityDesc;

        //开始时间
        private Date beginDateTime;

        //结束时间
        private Date endDateTime;

        //库存
        private Integer stockCount;

        //每人可以参与次数
        private Integer takeCount;

        // 活动状态：编辑、提审、撤审、通过、运行、拒绝、关闭、开启
        private Integer state;


        public Builder activityId(Long val) {
            this.activityId = val;
            return this;
        }

        public Builder activityName(String val) {
            this.activityName = val;
            return this;
        }

        public Builder activityDesc(String val) {
            this.activityDesc = val;
            return this;
        }

        public Builder beginDateTime(Date val) {
            this.beginDateTime = val;
            return this;
        }

        public Builder endDateTime(Date val) {
            this.endDateTime = val;
            return this;
        }

        private Builder stockCount(Integer val) {
            this.stockCount = val;
            return this;
        }

        private Builder takeCount(Integer val) {
            this.stockCount = val;
            return this;
        }

        // 活动状态：编辑、提审、撤审、通过、运行、拒绝、关闭、开启
        private Builder state(Integer val) {
            this.state = val;
            return this;
        }
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public Date getBeginDateTime() {
        return beginDateTime;
    }

    public void setBeginDateTime(Date beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getTakeCount() {
        return takeCount;
    }

    public void setTakeCount(Integer takeCount) {
        this.takeCount = takeCount;
    }

    @Override
    public String toString() {
        return "ActivityDto{" +
                "activityId=" + activityId +
                ", activityName='" + activityName + '\'' +
                ", activityDesc='" + activityDesc + '\'' +
                ", beginDateTime=" + beginDateTime +
                ", endDateTime=" + endDateTime +
                ", stockCount=" + stockCount +
                ", takeCount=" + takeCount +
                '}';
    }
}
