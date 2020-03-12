package com.accp.mapper;

import com.accp.domain.Moneybelong;
import com.accp.domain.MoneybelongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneybelongMapper {
    int countByExample(MoneybelongExample example);

    int deleteByExample(MoneybelongExample example);

    int deleteByPrimaryKey(String moneybelongId);

    int insert(Moneybelong record);

    int insertSelective(Moneybelong record);

    List<Moneybelong> selectByExample(MoneybelongExample example);

    Moneybelong selectByPrimaryKey(String moneybelongId);

    int updateByExampleSelective(@Param("record") Moneybelong record, @Param("example") MoneybelongExample example);

    int updateByExample(@Param("record") Moneybelong record, @Param("example") MoneybelongExample example);

    int updateByPrimaryKeySelective(Moneybelong record);

    int updateByPrimaryKey(Moneybelong record);
}