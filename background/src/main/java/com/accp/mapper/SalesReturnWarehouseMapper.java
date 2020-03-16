package com.accp.mapper;

import com.accp.domain.SalesOutWarehouse;
import com.accp.domain.SalesReturnWarehouse;
import com.accp.domain.SalesReturnWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
    //查询
    @Select("SELECT * FROM sales_return_warehouse WHERE srw_yn='0'")
    List<SalesReturnWarehouse> seleAll();

    //按日期查询单据数量
    @Select("select count(*) from sales_return_warehouse where srw_document_date=#{srw_document_date}")
    int selectDate(@Param("srw_document_date") String srw_document_date); 
    
    
    //修改审核状态
    @Update("update sales_return_warehouse set srw_auditing=#{srw_auditing} where srw_id=#{srw_id}")
    int updateStatus(@Param("srw_auditing") String sow_auditing,@Param("srw_id") String srw_id);
    
  //假删除
    @Update("UPDATE sales_return_warehouse set srw_yn='1' where srw_id=#{srw_id}")
    int updata(@Param("srw_id") String srw_id);
}