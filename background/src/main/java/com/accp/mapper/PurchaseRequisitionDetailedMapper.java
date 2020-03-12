package com.accp.mapper;

import com.accp.domain.PurchaseRequisitionDetailed;
import com.accp.domain.PurchaseRequisitionDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseRequisitionDetailedMapper {
    int countByExample(PurchaseRequisitionDetailedExample example);

    int deleteByExample(PurchaseRequisitionDetailedExample example);

    int deleteByPrimaryKey(String prdId);

    int insert(PurchaseRequisitionDetailed record);

    int insertSelective(PurchaseRequisitionDetailed record);

    List<PurchaseRequisitionDetailed> selectByExample(PurchaseRequisitionDetailedExample example);

    PurchaseRequisitionDetailed selectByPrimaryKey(String prdId);

    int updateByExampleSelective(@Param("record") PurchaseRequisitionDetailed record, @Param("example") PurchaseRequisitionDetailedExample example);

    int updateByExample(@Param("record") PurchaseRequisitionDetailed record, @Param("example") PurchaseRequisitionDetailedExample example);

    int updateByPrimaryKeySelective(PurchaseRequisitionDetailed record);

    int updateByPrimaryKey(PurchaseRequisitionDetailed record);
}