package com.accp.mapper;

import com.accp.domain.SalesOrderType;
import com.accp.domain.SalesOrderTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesOrderTypeMapper {
    int countByExample(SalesOrderTypeExample example);

    int deleteByExample(SalesOrderTypeExample example);

    int deleteByPrimaryKey(String sotId);

    int insert(SalesOrderType record);

    int insertSelective(SalesOrderType record);

    List<SalesOrderType> selectByExample(SalesOrderTypeExample example);

    SalesOrderType selectByPrimaryKey(String sotId);

    int updateByExampleSelective(@Param("record") SalesOrderType record, @Param("example") SalesOrderTypeExample example);

    int updateByExample(@Param("record") SalesOrderType record, @Param("example") SalesOrderTypeExample example);

    int updateByPrimaryKeySelective(SalesOrderType record);

    int updateByPrimaryKey(SalesOrderType record);
}