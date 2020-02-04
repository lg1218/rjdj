package com.accp.mapper;

import com.accp.domain.Salesquotationlist;
import com.accp.domain.SalesquotationlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesquotationlistMapper {
    int countByExample(SalesquotationlistExample example);

    int deleteByExample(SalesquotationlistExample example);

    int deleteByPrimaryKey(String sqlDocumentnumber);

    int insert(Salesquotationlist record);

    int insertSelective(Salesquotationlist record);

    List<Salesquotationlist> selectByExample(SalesquotationlistExample example);

    Salesquotationlist selectByPrimaryKey(String sqlDocumentnumber);

    int updateByExampleSelective(@Param("record") Salesquotationlist record, @Param("example") SalesquotationlistExample example);

    int updateByExample(@Param("record") Salesquotationlist record, @Param("example") SalesquotationlistExample example);

    int updateByPrimaryKeySelective(Salesquotationlist record);

    int updateByPrimaryKey(Salesquotationlist record);
}