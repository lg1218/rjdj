package com.accp.mapper;

import com.accp.domain.SalesReturnWarehouse;
import com.accp.domain.SalesReturnWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesReturnWarehouseMapper {
    int countByExample(SalesReturnWarehouseExample example);

    int deleteByExample(SalesReturnWarehouseExample example);

    int deleteByPrimaryKey(String srwId);

    int insert(SalesReturnWarehouse record);

    int insertSelective(SalesReturnWarehouse record);

    List<SalesReturnWarehouse> selectByExample(SalesReturnWarehouseExample example);

    SalesReturnWarehouse selectByPrimaryKey(String srwId);

    int updateByExampleSelective(@Param("record") SalesReturnWarehouse record, @Param("example") SalesReturnWarehouseExample example);

    int updateByExample(@Param("record") SalesReturnWarehouse record, @Param("example") SalesReturnWarehouseExample example);

    int updateByPrimaryKeySelective(SalesReturnWarehouse record);

    int updateByPrimaryKey(SalesReturnWarehouse record);
}