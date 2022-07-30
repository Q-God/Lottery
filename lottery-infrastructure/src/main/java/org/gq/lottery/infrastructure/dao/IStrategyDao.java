package org.gq.lottery.infrastructure.dao;

import org.gq.lottery.infrastructure.po.Strategy;

public interface IStrategyDao {

    Strategy queryStrategy(Long strategyId);
}
