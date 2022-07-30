package org.gq.lottery.infrastructure.dao;

import org.gq.lottery.infrastructure.po.StrategyDetail;

import java.util.List;

public interface IStrategyDetailDao {

    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

}
