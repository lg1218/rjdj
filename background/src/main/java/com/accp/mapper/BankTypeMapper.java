package com.accp.mapper;

import com.accp.domain.BankType;
import com.accp.domain.BankTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankTypeMapper {
    int countByExample(BankTypeExample example);

    int deleteByExample(BankTypeExample example);

    int deleteByPrimaryKey(String btId);

    int insert(BankType record);

    int insertSelective(BankType record);

    List<BankType> selectByExample(BankTypeExample example);

    BankType selectByPrimaryKey(String btId);

    int updateByExampleSelective(@Param("record") BankType record, @Param("example") BankTypeExample example);

    int updateByExample(@Param("record") BankType record, @Param("example") BankTypeExample example);

    int updateByPrimaryKeySelective(BankType record);

    int updateByPrimaryKey(BankType record);
}