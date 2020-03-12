package com.accp.mapper;

import com.accp.domain.PurchasingOrderType;
import com.accp.domain.PurchasingOrderTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasingOrderTypeMapper {
    int countByExample(PurchasingOrderTypeExample example);

    int deleteByExample(PurchasingOrderTypeExample example);

    int deleteByPrimaryKey(String potId);

    int insert(PurchasingOrderType record);

    int insertSelective(PurchasingOrderType record);

    List<PurchasingOrderType> selectByExample(PurchasingOrderTypeExample example);

    PurchasingOrderType selectByPrimaryKey(String potId);

    int updateByExampleSelective(@Param("record") PurchasingOrderType record, @Param("example") PurchasingOrderTypeExample example);

    int updateByExample(@Param("record") PurchasingOrderType record, @Param("example") PurchasingOrderTypeExample example);

    int updateByPrimaryKeySelective(PurchasingOrderType record);

    int updateByPrimaryKey(PurchasingOrderType record);
}