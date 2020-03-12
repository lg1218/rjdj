package com.accp.mapper;

import com.accp.domain.SalesOutWarehouseDetailed;
import com.accp.domain.SalesOutWarehouseDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SalesOutWarehouseDetailedMapper {
    int countByExample(SalesOutWarehouseDetailedExample example);

    int deleteByExample(SalesOutWarehouseDetailedExample example);

    int deleteByPrimaryKey(String sowdId);

    int insert(SalesOutWarehouseDetailed record);

    int insertSelective(SalesOutWarehouseDetailed record);

    List<SalesOutWarehouseDetailed> selectByExample(SalesOutWarehouseDetailedExample example);

    SalesOutWarehouseDetailed selectByPrimaryKey(String sowdId);

    int updateByExampleSelective(@Param("record") SalesOutWarehouseDetailed record, @Param("example") SalesOutWarehouseDetailedExample example);

    int updateByExample(@Param("record") SalesOutWarehouseDetailed record, @Param("example") SalesOutWarehouseDetailedExample example);

    int updateByPrimaryKeySelective(SalesOutWarehouseDetailed record);

    int updateByPrimaryKey(SalesOutWarehouseDetailed record);
    
    //按主表id查询
    @Select("select * from sales_out_warehouse_detailed where sow_id=#{sow_id}")
    List<SalesOutWarehouseDetailed> selectId(@Param("sow_id") String sow_id);
}