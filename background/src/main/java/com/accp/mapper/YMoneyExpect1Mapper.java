package com.accp.mapper;

import com.accp.domain.YMoneyExpect1;
import com.accp.domain.YMoneyExpect1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMoneyExpect1Mapper {
    int countByExample(YMoneyExpect1Example example);

    int deleteByExample(YMoneyExpect1Example example);

    int deleteByPrimaryKey(String id);

    int insert(YMoneyExpect1 record);

    int insertSelective(YMoneyExpect1 record);

    List<YMoneyExpect1> selectByExample(YMoneyExpect1Example example);

    YMoneyExpect1 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") YMoneyExpect1 record, @Param("example") YMoneyExpect1Example example);

    int updateByExample(@Param("record") YMoneyExpect1 record, @Param("example") YMoneyExpect1Example example);

    int updateByPrimaryKeySelective(YMoneyExpect1 record);

    int updateByPrimaryKey(YMoneyExpect1 record);
}