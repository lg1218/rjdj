package com.accp.mapper;

import com.accp.domain.Matter;
import com.accp.domain.MatterExample;
import com.accp.domain.wdMatter;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MatterMapper {
    int countByExample(MatterExample example);

    int deleteByExample(MatterExample example);

    int deleteByPrimaryKey(String matterId);

    int insert(Matter record);

    int insertSelective(Matter record);

    List<Matter> selectByExample(MatterExample example);

    Matter selectByPrimaryKey(String matterId);

    int updateByExampleSelective(@Param("record") Matter record, @Param("example") MatterExample example);

    int updateByExample(@Param("record") Matter record, @Param("example") MatterExample example);

    int updateByPrimaryKeySelective(Matter record);

    int updateByPrimaryKey(Matter record);
    
    //查询物料数量
    @Select("SELECT matter_nowcount FROM `matter` WHERE  matter_id = #{matter_id}")
    int selectCount(@Param("matter_id") String matter_id);
    
    //减少库存
    @Update("UPDATE matter SET matter_nowcount=matter_nowcount-#{Number} WHERE matter_id=#{matter_id}")
    int Reduce(@Param("Number") Double Number,@Param("matter_id") String matter_id);
    
    
    
    @Select("SELECT \n" + 
    		"ma.matter_id AS matterId,ma.matter_name AS mmatterName,\n" + 
    		"m.mu_id AS mamuId,ma.matter_size AS mmatterSize,\n" + 
    		"m.mu_name AS muName,\n" + 
    		"ma.matter_nowcount AS mmatterNowcount,\n" + 
    		"ma.matter_nowavgcost AS mmatterNowavgcost,\n" + 
    		"(ma.matter_nowallcost/ma.matter_nowcount)AS mmonePrice	\n" + 
    		"FROM \n" + 
    		"	measurement_unit AS m,\n" + 
    		"	matter AS ma	\n" + 
    		"WHERE ma.mu_id=m.mu_id")
	List<wdMatter> selectAllMatter();
	
	 List<Matter> selectAll();
	 
	 List<Matter> selectbymatterid(String matterId);
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Matter WHERE Matter_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
}