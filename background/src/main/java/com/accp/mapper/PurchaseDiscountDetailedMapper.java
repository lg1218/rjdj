package com.accp.mapper;

import com.accp.domain.PurchaseDiscountDetailed;
import com.accp.domain.PurchaseDiscountDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseDiscountDetailedMapper {
    int countByExample(PurchaseDiscountDetailedExample example);

    int deleteByExample(PurchaseDiscountDetailedExample example);

    int deleteByPrimaryKey(String pddId);

    int insert(PurchaseDiscountDetailed record);

    int insertSelective(PurchaseDiscountDetailed record);

    List<PurchaseDiscountDetailed> selectByExample(PurchaseDiscountDetailedExample example);

    PurchaseDiscountDetailed selectByPrimaryKey(String pddId);

    int updateByExampleSelective(@Param("record") PurchaseDiscountDetailed record, @Param("example") PurchaseDiscountDetailedExample example);

    int updateByExample(@Param("record") PurchaseDiscountDetailed record, @Param("example") PurchaseDiscountDetailedExample example);

    int updateByPrimaryKeySelective(PurchaseDiscountDetailed record);

    int updateByPrimaryKey(PurchaseDiscountDetailed record);
}