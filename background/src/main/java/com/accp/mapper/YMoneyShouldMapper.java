package com.accp.mapper;

import com.accp.domain.YMoneyShould;
import com.accp.domain.YMoneyShouldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMoneyShouldMapper {
    int countByExample(YMoneyShouldExample example);

    int deleteByExample(YMoneyShouldExample example);

    int deleteByPrimaryKey(String id);

    int insert(YMoneyShould record);

    int insertSelective(YMoneyShould record);

    List<YMoneyShould> selectByExample(YMoneyShouldExample example);

    YMoneyShould selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") YMoneyShould record, @Param("example") YMoneyShouldExample example);

    int updateByExample(@Param("record") YMoneyShould record, @Param("example") YMoneyShouldExample example);

    int updateByPrimaryKeySelective(YMoneyShould record);

    int updateByPrimaryKey(YMoneyShould record);
}