package com.accp.mapper;

import com.accp.domain.PurchaseRequisitionType;
import com.accp.domain.PurchaseRequisitionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseRequisitionTypeMapper {
    int countByExample(PurchaseRequisitionTypeExample example);

    int deleteByExample(PurchaseRequisitionTypeExample example);

    int deleteByPrimaryKey(String prtId);

    int insert(PurchaseRequisitionType record);

    int insertSelective(PurchaseRequisitionType record);

    List<PurchaseRequisitionType> selectByExample(PurchaseRequisitionTypeExample example);

    PurchaseRequisitionType selectByPrimaryKey(String prtId);

    int updateByExampleSelective(@Param("record") PurchaseRequisitionType record, @Param("example") PurchaseRequisitionTypeExample example);

    int updateByExample(@Param("record") PurchaseRequisitionType record, @Param("example") PurchaseRequisitionTypeExample example);

    int updateByPrimaryKeySelective(PurchaseRequisitionType record);

    int updateByPrimaryKey(PurchaseRequisitionType record);
}