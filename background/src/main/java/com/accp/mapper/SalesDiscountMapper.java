package com.accp.mapper;

import com.accp.domain.SalesDiscount;
import com.accp.domain.SalesDiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesDiscountMapper {
    int countByExample(SalesDiscountExample example);

    int deleteByExample(SalesDiscountExample example);

    int deleteByPrimaryKey(String sdId);

    int insert(SalesDiscount record);

    int insertSelective(SalesDiscount record);

    List<SalesDiscount> selectByExample(SalesDiscountExample example);

    SalesDiscount selectByPrimaryKey(String sdId);

    int updateByExampleSelective(@Param("record") SalesDiscount record, @Param("example") SalesDiscountExample example);

    int updateByExample(@Param("record") SalesDiscount record, @Param("example") SalesDiscountExample example);

    int updateByPrimaryKeySelective(SalesDiscount record);

    int updateByPrimaryKey(SalesDiscount record);
}