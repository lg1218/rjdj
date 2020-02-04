package com.accp.mapper;

import com.accp.domain.YMoneyExpect;
import com.accp.domain.YMoneyExpectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMoneyExpectMapper {
    int countByExample(YMoneyExpectExample example);

    int deleteByExample(YMoneyExpectExample example);

    int deleteByPrimaryKey(String id);

    int insert(YMoneyExpect record);

    int insertSelective(YMoneyExpect record);

    List<YMoneyExpect> selectByExample(YMoneyExpectExample example);

    YMoneyExpect selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") YMoneyExpect record, @Param("example") YMoneyExpectExample example);

    int updateByExample(@Param("record") YMoneyExpect record, @Param("example") YMoneyExpectExample example);

    int updateByPrimaryKeySelective(YMoneyExpect record);

    int updateByPrimaryKey(YMoneyExpect record);
}