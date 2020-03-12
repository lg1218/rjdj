package com.accp.mapper;

import com.accp.domain.SettleAccountsType;
import com.accp.domain.SettleAccountsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettleAccountsTypeMapper {
    int countByExample(SettleAccountsTypeExample example);

    int deleteByExample(SettleAccountsTypeExample example);

    int deleteByPrimaryKey(String satId);

    int insert(SettleAccountsType record);

    int insertSelective(SettleAccountsType record);

    List<SettleAccountsType> selectByExample(SettleAccountsTypeExample example);

    SettleAccountsType selectByPrimaryKey(String satId);

    int updateByExampleSelective(@Param("record") SettleAccountsType record, @Param("example") SettleAccountsTypeExample example);

    int updateByExample(@Param("record") SettleAccountsType record, @Param("example") SettleAccountsTypeExample example);

    int updateByPrimaryKeySelective(SettleAccountsType record);

    int updateByPrimaryKey(SettleAccountsType record);
}