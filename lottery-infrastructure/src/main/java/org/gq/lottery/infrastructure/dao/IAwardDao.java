package org.gq.lottery.infrastructure.dao;

import org.gq.lottery.infrastructure.po.Award;

@M
public interface IAwardDao {

    Award queryAwardInfo(String awardId);
}
