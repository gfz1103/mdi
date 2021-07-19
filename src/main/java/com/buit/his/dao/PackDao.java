package com.buit.his.dao;

import com.buit.his.request.PackMedSendReqXml;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by sg on 2021/4/15.
 */
@Mapper
public interface PackDao {

    Map<String, Object> queryLxByJlid(@Param("jlid") Integer jlid);

    List<PackMedSendReqXml> queryMedList(@Param("jlid") Integer jlid);

    void insertPackLog(Map map);

    long queryCountByJlid(@Param("jlid") Integer jlid);
}
