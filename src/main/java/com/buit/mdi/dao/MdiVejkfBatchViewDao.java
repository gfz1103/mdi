package com.buit.mdi.dao;

import com.buit.mdi.response.HighQualityConsumablesResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MdiVejkfBatchViewDao {

	List<HighQualityConsumablesResp> queryHighQualityConsumables(@Param("list") List<String> list);

	/**
	 * 项目编码查询库存
	 *
	 * @param xmbm 项目编码
	 */
	List<HighQualityConsumablesResp> findListByXmbm(String xmbm);
}
