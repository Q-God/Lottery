package org.gq.lottery.domain.strategy.model.aggregates;


import java.io.Serializable;
import java.util.List;

public class StrategyRich implements Serializable {
    private static final long serialVersionUID = 1349722619061845203L;

    //策略ID
    private Long strategyId;
    //策略配置
    private Strategy strategy;
    //策略明细
    private List<StrategyDetail> strategyDetailList;


}
