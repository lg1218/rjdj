package com.accp.mapper;

import com.accp.domain.SalesOutWarehouseDetailed;
import com.accp.domain.SalesOutWarehouseDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SalesOutWarehouseDetailedMapper {
    int countByExample(SalesOutWarehouseDetailedExample example);

    int deleteByExample(SalesOutWarehouseDetailedExample example);

    int deleteByPrimaryKey(Integer ziid);

    int insert(SalesOutWarehouseDetailed record);

    int insertSelective(SalesOutWarehouseDetailed record);

    List<SalesOutWarehouseDetailed> selectByExample(SalesOutWarehouseDetailedExample example);

    SalesOutWarehouseDetailed selectByPrimaryKey(Integer ziid);

    int updateByExampleSelective(@Param("record") SalesOutWarehouseDetailed record, @Param("example") SalesOutWarehouseDetailedExample example);

    int updateByExample(@Param("record") SalesOutWarehouseDetailed record, @Param("example") SalesOutWarehouseDetailedExample example);

    int updateByPrimaryKeySelective(SalesOutWarehouseDetailed record);

    int updateByPrimaryKey(SalesOutWarehouseDetailed record);
    
    //按主表id查询
    @Select("select * from sales_out_warehouse_detailed where zuid=#{zuid} and delet='0'")
    List<SalesOutWarehouseDetailed> selectId(@Param("zuid") String zuid);
    
    //假删除
    @Update("UPDATE sales_out_warehouse_detailed set delet='1' where zuid=#{zuid}")
    int updaate(@Param("zuid") String zuid);
    
    //出库
    @Update("UPDATE sales_out_warehouse_detailed set custom4=#{custom4} where ziid=#{ziid}")
    int Stock(@Param("custom4") String custom4,@Param("ziid") Integer ziid);
    
    //查询为出库数量
    @Select("select custom4 from sales_out_warehouse_detailed where ziid=#{ziid}")
    int cuNumber(@Param("ziid") Integer ziid);
}