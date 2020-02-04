package com.accp.mapper;

import com.accp.domain.YMoneyExpect2;
import com.accp.domain.YMoneyExpect2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMoneyExpect2Mapper {
    int countByExample(YMoneyExpect2Example example);

    int deleteByExample(YMoneyExpect2Example example);

    int deleteByPrimaryKey(String id);

    int insert(YMoneyExpect2 record);

    int insertSelective(YMoneyExpect2 record);

    List<YMoneyExpect2> selectByExample(YMoneyExpect2Example example);

    YMoneyExpect2 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") YMoneyExpect2 record, @Param("example") YMoneyExpect2Example example);

    int updateByExample(@Param("record") YMoneyExpect2 record, @Param("example") YMoneyExpect2Example example);

    int updateByPrimaryKeySelective(YMoneyExpect2 record);

    int updateByPrimaryKey(YMoneyExpect2 record);
}