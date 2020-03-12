package com.accp.mapper;

import com.accp.domain.SalesOutWarehouse;
import com.accp.domain.SalesOutWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SalesOutWarehouseMapper {
    int countByExample(SalesOutWarehouseExample example);

    int deleteByExample(SalesOutWarehouseExample example);

    int deleteByPrimaryKey(String sowId);

    int insert(SalesOutWarehouse record);

    int insertSelective(SalesOutWarehouse record);

    List<SalesOutWarehouse> selectByExample(SalesOutWarehouseExample example);

    SalesOutWarehouse selectByPrimaryKey(String sowId);

    int updateByExampleSelective(@Param("record") SalesOutWarehouse record, @Param("example") SalesOutWarehouseExample example);

    int updateByExample(@Param("record") SalesOutWarehouse record, @Param("example") SalesOutWarehouseExample example);

    int updateByPrimaryKeySelective(SalesOutWarehouse record);

    int updateByPrimaryKey(SalesOutWarehouse record);
    
    @Select("select * from sales_out_warehouse")
    List<SalesOutWarehouse> seleAll();
}