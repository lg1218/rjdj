package com.accp.mapper;

import com.accp.domain.BankDepositAccount;
import com.accp.domain.BankDepositAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankDepositAccountMapper {
    int countByExample(BankDepositAccountExample example);

    int deleteByExample(BankDepositAccountExample example);

    int deleteByPrimaryKey(String adaId);

    int insert(BankDepositAccount record);

    int insertSelective(BankDepositAccount record);

    List<BankDepositAccount> selectByExample(BankDepositAccountExample example);

    BankDepositAccount selectByPrimaryKey(String adaId);

    int updateByExampleSelective(@Param("record") BankDepositAccount record, @Param("example") BankDepositAccountExample example);

    int updateByExample(@Param("record") BankDepositAccount record, @Param("example") BankDepositAccountExample example);

    int updateByPrimaryKeySelective(BankDepositAccount record);

    int updateByPrimaryKey(BankDepositAccount record);
}