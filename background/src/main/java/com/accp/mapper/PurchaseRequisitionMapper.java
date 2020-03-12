package com.accp.mapper;

import com.accp.domain.PurchaseRequisition;
import com.accp.domain.PurchaseRequisitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseRequisitionMapper {
    int countByExample(PurchaseRequisitionExample example);

    int deleteByExample(PurchaseRequisitionExample example);

    int deleteByPrimaryKey(String prId);

    int insert(PurchaseRequisition record);

    int insertSelective(PurchaseRequisition record);

    List<PurchaseRequisition> selectByExample(PurchaseRequisitionExample example);

    PurchaseRequisition selectByPrimaryKey(String prId);

    int updateByExampleSelective(@Param("record") PurchaseRequisition record, @Param("example") PurchaseRequisitionExample example);

    int updateByExample(@Param("record") PurchaseRequisition record, @Param("example") PurchaseRequisitionExample example);

    int updateByPrimaryKeySelective(PurchaseRequisition record);

    int updateByPrimaryKey(PurchaseRequisition record);
}