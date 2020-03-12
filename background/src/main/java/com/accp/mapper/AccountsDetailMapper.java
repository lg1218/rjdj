package com.accp.mapper;

import com.accp.domain.AccountsDetail;

import java.util.List;

import com.accp.domain.AccountsDetailExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AccountsDetailMapper {
    int countByExample(AccountsDetailExample example);

    int deleteByExample(AccountsDetailExample example);

    int deleteByPrimaryKey(Integer accedeId);

    int insert(AccountsDetail record);

    int insertSelective(AccountsDetail record);

    List<AccountsDetail> selectByExample(AccountsDetailExample example);

    AccountsDetail selectByPrimaryKey(Integer accedeId);

    int updateByExampleSelective(@Param("record") AccountsDetail record, @Param("example") AccountsDetailExample example);

    int updateByExample(@Param("record") AccountsDetail record, @Param("example") AccountsDetailExample example);

    int updateByPrimaryKeySelective(AccountsDetail record);

    int updateByPrimaryKey(AccountsDetail record);
    //查询单币别账款
    List<AccountsDetail> queryBySingleCurrency(@Param("supplierId") String supplierId);
    //查询多币别账款
    List<AccountsDetail> queryByMoreCurrency(@Param("supplierId") String supplierId);
    /*查询某时间段该供应商现行余额不为0的账款*/
    List<AccountsDetail> queryByfirstDue(@Param("supplierName")String supplierName,@Param("date1")String date1);
    //根据payablesId查询
    List<AccountsDetail> selectBypayablesId(Integer payablesId);
}