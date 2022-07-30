package org.gq.lottery.infrastructure.dao;

import org.gq.lottery.infrastructure.po.Activity;


public interface IActivityDao {

    void insert(Activity req);

    Activity queryActivityById(Long id);


}
