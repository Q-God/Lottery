package org.gq.lottery.rpc;

import org.apache.ibatis.annotations.Mapper;
import org.gq.lottery.rpc.req.ActivityReq;
import org.gq.lottery.rpc.res.ActivityRes;

/**
 * 活动展台
 * 1.创建活动
 * 2.更新活动
 * 3.查询活动
 */
@Mapper
public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);
}
