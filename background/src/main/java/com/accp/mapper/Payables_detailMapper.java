package com.accp.mapper;

import com.accp.domain.Payables;
import com.accp.domain.Payables_detail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Payables_detailMapper {
    int deleteByPrimaryKey(String paydetailId);

    int insert(Payables_detail record);

    int insertSelective(Payables_detail record);

    Payables_detail selectByPrimaryKey(String paydetailId);

    int updateByPrimaryKeySelective(Payables_detail record);

    int updateByPrimaryKey(Payables_detail record);

    List<Payables_detail> queryByPayablesId(@Param("payablesId") String payablesId);
    /*查询某时间段该供应商现行余额不为0的账款*/
    List<Payables_detail> queryByfirstDue(@Param("supplierName")String supplierName, @Param("date1")String date1);
}