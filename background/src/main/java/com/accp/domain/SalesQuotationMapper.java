package com.accp.mapper;

import com.accp.domain.SalesQuotation;
import com.accp.domain.SalesQuotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SalesQuotationMapper {
    int countByExample(SalesQuotationExample example);

    int deleteByExample(SalesQuotationExample example);

    int deleteByPrimaryKey(String sqId);

    int insert(SalesQuotation record);

    int insertSelective(SalesQuotation record);

    List<SalesQuotation> selectByExample(SalesQuotationExample example);

    SalesQuotation selectByPrimaryKey(String sqId);

    int updateByExampleSelective(@Param("record") SalesQuotation record, @Param("example") SalesQuotationExample example);

    int updateByExample(@Param("record") SalesQuotation record, @Param("example") SalesQuotationExample example);

    int updateByPrimaryKeySelective(SalesQuotation record);

    int updateByPrimaryKey(SalesQuotation record);
    
    //按客户查询
    @Select("SELECT * FROM `sales_quotation` WHERE customer_id=#{customer_id}")
    List<SalesQuotation> selectCid(@Param("customer_id") String customer_id);
}