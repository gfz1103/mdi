package com.buit.his.dao;

import com.buit.his.request.HisCubeBzEjkfPush;

import java.util.Map;

/**
 * Created by sg on 2021/5/18.
 */
public interface HrpDao {

    HisCubeBzEjkfPush queryFymxByJlxh(Integer jlxh);

    void insertHrpLog(Map map);
}
