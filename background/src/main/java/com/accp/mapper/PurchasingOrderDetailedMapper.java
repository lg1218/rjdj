package com.accp.mapper;

import com.accp.domain.PurchasingOrderDetailed;
import com.accp.domain.PurchasingOrderDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasingOrderDetailedMapper {
    int countByExample(PurchasingOrderDetailedExample example);

    int deleteByExample(PurchasingOrderDetailedExample example);

    int deleteByPrimaryKey(String podId);

    int insert(PurchasingOrderDetailed record);

    int insertSelective(PurchasingOrderDetailed record);

    List<PurchasingOrderDetailed> selectByExample(PurchasingOrderDetailedExample example);

    PurchasingOrderDetailed selectByPrimaryKey(String podId);

    int updateByExampleSelective(@Param("record") PurchasingOrderDetailed record, @Param("example") PurchasingOrderDetailedExample example);

    int updateByExample(@Param("record") PurchasingOrderDetailed record, @Param("example") PurchasingOrderDetailedExample example);

    int updateByPrimaryKeySelective(PurchasingOrderDetailed record);

    int updateByPrimaryKey(PurchasingOrderDetailed record);
}