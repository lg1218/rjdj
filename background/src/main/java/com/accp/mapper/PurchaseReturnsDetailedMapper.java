package com.accp.mapper;

import com.accp.domain.PurchaseReturnsDetailed;
import com.accp.domain.PurchaseReturnsDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseReturnsDetailedMapper {
    int countByExample(PurchaseReturnsDetailedExample example);

    int deleteByExample(PurchaseReturnsDetailedExample example);

    int deleteByPrimaryKey(String puredId);

    int insert(PurchaseReturnsDetailed record);

    int insertSelective(PurchaseReturnsDetailed record);

    List<PurchaseReturnsDetailed> selectByExample(PurchaseReturnsDetailedExample example);

    PurchaseReturnsDetailed selectByPrimaryKey(String puredId);

    int updateByExampleSelective(@Param("record") PurchaseReturnsDetailed record, @Param("example") PurchaseReturnsDetailedExample example);

    int updateByExample(@Param("record") PurchaseReturnsDetailed record, @Param("example") PurchaseReturnsDetailedExample example);

    int updateByPrimaryKeySelective(PurchaseReturnsDetailed record);

    int updateByPrimaryKey(PurchaseReturnsDetailed record);
}