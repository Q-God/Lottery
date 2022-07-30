package org.gq.lottery.infrastructure.po;

import java.math.BigDecimal;
import java.util.Date;

public class StrategyDetail {

    // 自增ID
    private String id;

    // 策略ID
    private Long strategyId;

    // 奖品ID
    private String awardId;

    // 奖品数量
    private String awardCount;

    // 中奖概率
    private BigDecimal awardRate;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public String getAwardCount() {
        return awardCount;
    }

    public void setAwardCount(String awardCount) {
        this.awardCount = awardCount;
    }

    public BigDecimal getAwardRate() {
        return awardRate;
    }

    public void setAwardRate(BigDecimal awardRate) {
        this.awardRate = awardRate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
