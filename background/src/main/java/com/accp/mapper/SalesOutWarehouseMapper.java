package com.accp.mapper;

import com.accp.domain.SalesOutWarehouse;
import com.accp.domain.SalesOutWarehouseExample;
import com.accp.domain.Salesorder;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.PostMapping;

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
    
    @Select("SELECT * FROM sales_out_warehouse WHERE sow_yn='0'")
    List<SalesOutWarehouse> seleAll();
    
    //假删除
    @Update("UPDATE sales_out_warehouse set sow_yn='1' where sow_id=#{sow_id}")
    int updata(@Param("sow_id") String sow_id);
    
    //查询单号
    @Select("select count(*) from sales_out_warehouse where sow_document_date=#{sowdata}")
    int selecydata(@Param("sowdata") String sowdata);
    
    //修改审核状态
    @Update("update sales_out_warehouse set sow_auditing=#{sow_auditing},sow_custom4='0' where sow_id=#{sow_id}")
    int updateStatus(@Param("sow_auditing") String sow_auditing,@Param("sow_id") String sow_id);
    
    //查询单据状态
    @Select("select count(*) from sales_out_warehouse where sow_id=#{sow_id} and sow_custom3='1'")
    int selectsow_custom2(@Param("sow_id") String sow_id);
    
    //修改开不开发票的状态
    @Update("UPDATE sales_out_warehouse SET sow_custom3=#{sow_custom3} WHERE sow_id=#{sow_id}")
    int invoice(@Param("sow_custom3") String sow_custom3,@Param("sow_id") String sow_id);
    
    //按日期查询单据
    @Select("SELECT * FROM sales_out_warehouse WHERE srw_document_date>=#{data1} AND srw_document_date<=#{data2}")
    List<SalesOutWarehouse> seleBytime(@Param("data1") String data1,@Param("data2") String data2);
}