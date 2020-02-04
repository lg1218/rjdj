package com.accp.mapper;

import com.accp.domain.Salesquotation;
import com.accp.domain.SalesquotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesquotationMapper {
    int countByExample(SalesquotationExample example);

    int deleteByExample(SalesquotationExample example);

    int deleteByPrimaryKey(String sqDocumentnumber);

    int insert(Salesquotation record);

    int insertSelective(Salesquotation record);

    List<Salesquotation> selectByExample(SalesquotationExample example);

    Salesquotation selectByPrimaryKey(String sqDocumentnumber);

    int updateByExampleSelective(@Param("record") Salesquotation record, @Param("example") SalesquotationExample example);

    int updateByExample(@Param("record") Salesquotation record, @Param("example") SalesquotationExample example);

    int updateByPrimaryKeySelective(Salesquotation record);

    int updateByPrimaryKey(Salesquotation record);
}