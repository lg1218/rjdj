package com.accp.mapper;

import com.accp.domain.PCheckmemuDetail;
import com.accp.domain.PCheckmemuDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PCheckmemuDetailMapper {
    int countByExample(PCheckmemuDetailExample example);

    int deleteByExample(PCheckmemuDetailExample example);

    int deleteByPrimaryKey(String meBillno);

    int insert(PCheckmemuDetail record);

    int insertSelective(PCheckmemuDetail record);

    List<PCheckmemuDetail> selectByExample(PCheckmemuDetailExample example);

    PCheckmemuDetail selectByPrimaryKey(String meBillno);

    int updateByExampleSelective(@Param("record") PCheckmemuDetail record, @Param("example") PCheckmemuDetailExample example);

    int updateByExample(@Param("record") PCheckmemuDetail record, @Param("example") PCheckmemuDetailExample example);

    int updateByPrimaryKeySelective(PCheckmemuDetail record);

    int updateByPrimaryKey(PCheckmemuDetail record);
}