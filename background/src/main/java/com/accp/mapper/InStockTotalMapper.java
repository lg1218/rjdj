package com.accp.mapper;

import com.accp.domain.InStockTotal;
import com.accp.domain.InStockTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InStockTotalMapper {
    int countByExample(InStockTotalExample example);

    int deleteByExample(InStockTotalExample example);

    int deleteByPrimaryKey(Integer istId);

    int insert(InStockTotal record);

    int insertSelective(InStockTotal record);

    List<InStockTotal> selectByExample(InStockTotalExample example);

    InStockTotal selectByPrimaryKey(Integer istId);

    int updateByExampleSelective(@Param("record") InStockTotal record, @Param("example") InStockTotalExample example);

    int updateByExample(@Param("record") InStockTotal record, @Param("example") InStockTotalExample example);

    int updateByPrimaryKeySelective(InStockTotal record);

    int updateByPrimaryKey(InStockTotal record);
}