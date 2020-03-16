package com.accp.mapper;

import com.accp.domain.SalesReturnWarehouseDetailed;
import com.accp.domain.SalesReturnWarehouseDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SalesReturnWarehouseDetailedMapper {
    int countByExample(SalesReturnWarehouseDetailedExample example);

    int deleteByExample(SalesReturnWarehouseDetailedExample example);

    int deleteByPrimaryKey(String ziid);

    int insert(SalesReturnWarehouseDetailed record);

    int insertSelective(SalesReturnWarehouseDetailed record);

    List<SalesReturnWarehouseDetailed> selectByExample(SalesReturnWarehouseDetailedExample example);

    SalesReturnWarehouseDetailed selectByPrimaryKey(String ziid);

    int updateByExampleSelective(@Param("record") SalesReturnWarehouseDetailed record, @Param("example") SalesReturnWarehouseDetailedExample example);

    int updateByExample(@Param("record") SalesReturnWarehouseDetailed record, @Param("example") SalesReturnWarehouseDetailedExample example);

    int updateByPrimaryKeySelective(SalesReturnWarehouseDetailed record);

    int updateByPrimaryKey(SalesReturnWarehouseDetailed record);
    
    //按主表id查询
    @Select("select * from sales_return_warehouse_detailed where zuid=#{zuid}")
    List<SalesReturnWarehouseDetailed> selectzhuID(@Param("zuid") String zuid);
    
  //假删除
    @Update("UPDATE sales_return_warehouse_detailed set srw_yn='1' where zuid=#{zuid}")
    int updaate(@Param("zuid") String zuid);
}