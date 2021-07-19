package com.buit.his.dao;

import com.buit.his.response.SelfQueryImDetailResp;
import com.buit.his.response.SelfQueryImResp;
import com.buit.his.response.SelfQueryItemResp;
import com.buit.his.response.SelfQueryMedResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by sg on 2021/4/24.
 */
public interface SelfCheckDao {
    List<SelfQueryItemResp> queryItem();

    List<SelfQueryMedResp> queryMed();

    SelfQueryImResp queryIm(@Param("zyhm") String zyhm, @Param("brxm") String brxm);

    List<SelfQueryImDetailResp> queryImDetail(@Param("zyh")String zyh, @Param("ksrq")String ksrq, @Param("jsrq")String jsrq);
}
