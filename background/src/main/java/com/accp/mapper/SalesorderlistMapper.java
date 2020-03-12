package com.accp.mapper;

import com.accp.domain.Salesorderlist;
import com.accp.domain.SalesorderlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesorderlistMapper {
    int countByExample(SalesorderlistExample example);

    int deleteByExample(SalesorderlistExample example);

    int deleteByPrimaryKey(String solId);

    int insert(Salesorderlist record);

    int insertSelective(Salesorderlist record);

    List<Salesorderlist> selectByExample(SalesorderlistExample example);

    Salesorderlist selectByPrimaryKey(String solId);

    int updateByExampleSelective(@Param("record") Salesorderlist record, @Param("example") SalesorderlistExample example);

    int updateByExample(@Param("record") Salesorderlist record, @Param("example") SalesorderlistExample example);

    int updateByPrimaryKeySelective(Salesorderlist record);

    int updateByPrimaryKey(Salesorderlist record);
}