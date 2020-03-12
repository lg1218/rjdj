package com.accp.mapper;

import com.accp.domain.Salesorder;
import com.accp.domain.SalesorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesorderMapper {
    int countByExample(SalesorderExample example);

    int deleteByExample(SalesorderExample example);

    int deleteByPrimaryKey(String soId);

    int insert(Salesorder record);

    int insertSelective(Salesorder record);

    List<Salesorder> selectByExample(SalesorderExample example);

    Salesorder selectByPrimaryKey(String soId);

    int updateByExampleSelective(@Param("record") Salesorder record, @Param("example") SalesorderExample example);

    int updateByExample(@Param("record") Salesorder record, @Param("example") SalesorderExample example);

    int updateByPrimaryKeySelective(Salesorder record);

    int updateByPrimaryKey(Salesorder record);
}