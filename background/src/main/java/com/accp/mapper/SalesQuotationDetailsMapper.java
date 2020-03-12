package com.accp.mapper;

import com.accp.domain.SalesQuotationDetails;
import com.accp.domain.SalesQuotationDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesQuotationDetailsMapper {
    int countByExample(SalesQuotationDetailsExample example);

    int deleteByExample(SalesQuotationDetailsExample example);

    int deleteByPrimaryKey(String sqdProdid);

    int insert(SalesQuotationDetails record);

    int insertSelective(SalesQuotationDetails record);

    List<SalesQuotationDetails> selectByExample(SalesQuotationDetailsExample example);

    SalesQuotationDetails selectByPrimaryKey(String sqdProdid);

    int updateByExampleSelective(@Param("record") SalesQuotationDetails record, @Param("example") SalesQuotationDetailsExample example);

    int updateByExample(@Param("record") SalesQuotationDetails record, @Param("example") SalesQuotationDetailsExample example);

    int updateByPrimaryKeySelective(SalesQuotationDetails record);

    int updateByPrimaryKey(SalesQuotationDetails record);
}