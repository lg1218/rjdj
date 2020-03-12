package com.accp.mapper;

import com.accp.domain.Receivablesdetails;
import com.accp.domain.ReceivablesdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceivablesdetailsMapper {
    int countByExample(ReceivablesdetailsExample example);

    int deleteByExample(ReceivablesdetailsExample example);

    int deleteByPrimaryKey(String recedetailId);

    int insert(Receivablesdetails record);

    int insertSelective(Receivablesdetails record);

    List<Receivablesdetails> selectByExample(ReceivablesdetailsExample example);

    Receivablesdetails selectByPrimaryKey(String recedetailId);

    int updateByExampleSelective(@Param("record") Receivablesdetails record, @Param("example") ReceivablesdetailsExample example);

    int updateByExample(@Param("record") Receivablesdetails record, @Param("example") ReceivablesdetailsExample example);

    int updateByPrimaryKeySelective(Receivablesdetails record);

    int updateByPrimaryKey(Receivablesdetails record);
}