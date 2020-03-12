package com.accp.mapper;

import com.accp.domain.SalesReturnWarehouseDetailed;
import com.accp.domain.SalesReturnWarehouseDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesReturnWarehouseDetailedMapper {
    int countByExample(SalesReturnWarehouseDetailedExample example);

    int deleteByExample(SalesReturnWarehouseDetailedExample example);

    int deleteByPrimaryKey(String srwdId);

    int insert(SalesReturnWarehouseDetailed record);

    int insertSelective(SalesReturnWarehouseDetailed record);

    List<SalesReturnWarehouseDetailed> selectByExample(SalesReturnWarehouseDetailedExample example);

    SalesReturnWarehouseDetailed selectByPrimaryKey(String srwdId);

    int updateByExampleSelective(@Param("record") SalesReturnWarehouseDetailed record, @Param("example") SalesReturnWarehouseDetailedExample example);

    int updateByExample(@Param("record") SalesReturnWarehouseDetailed record, @Param("example") SalesReturnWarehouseDetailedExample example);

    int updateByPrimaryKeySelective(SalesReturnWarehouseDetailed record);

    int updateByPrimaryKey(SalesReturnWarehouseDetailed record);
}