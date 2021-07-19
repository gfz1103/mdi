package com.buit.mdi.api;

import com.buit.mdi.dao.MdiVejkfBatchViewDao;
import com.buit.mdi.response.HighQualityConsumablesResp;
import com.buit.mdi.service.MdiVejkfBatchViewService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService(timeout = 10000)
public class MdiVejkfBatchViewServiceImpl implements MdiVejkfBatchViewService{

	static final Logger logger = LoggerFactory.getLogger(MdiVejkfBatchViewServiceImpl.class);

	@Autowired
	private MdiVejkfBatchViewDao mdiVejkfBatchViewDao;

	@Override
	public List<HighQualityConsumablesResp> queryHighQualityConsumables(List<String> str) {
		return mdiVejkfBatchViewDao.queryHighQualityConsumables(str);
	}

	@Override
	public List<HighQualityConsumablesResp> findListByXmbm(String xmbm) {
		return mdiVejkfBatchViewDao.findListByXmbm(xmbm);
	}
}
