package com.accp.mapper;

import com.accp.domain.PurchaseDiscount;
import com.accp.domain.PurchaseDiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseDiscountMapper {
    int countByExample(PurchaseDiscountExample example);

    int deleteByExample(PurchaseDiscountExample example);

    int deleteByPrimaryKey(String pdId);

    int insert(PurchaseDiscount record);

    int insertSelective(PurchaseDiscount record);

    List<PurchaseDiscount> selectByExample(PurchaseDiscountExample example);

    PurchaseDiscount selectByPrimaryKey(String pdId);

    int updateByExampleSelective(@Param("record") PurchaseDiscount record, @Param("example") PurchaseDiscountExample example);

    int updateByExample(@Param("record") PurchaseDiscount record, @Param("example") PurchaseDiscountExample example);

    int updateByPrimaryKeySelective(PurchaseDiscount record);

    int updateByPrimaryKey(PurchaseDiscount record);
}