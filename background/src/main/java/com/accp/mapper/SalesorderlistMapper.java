package com.accp.mapper;

import com.accp.domain.Salesorderlist;
import com.accp.domain.SalesorderlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SalesorderlistMapper {
    int countByExample(SalesorderlistExample example);

    int deleteByExample(SalesorderlistExample example);

    int deleteByPrimaryKey(Integer ziid);

    int insert(Salesorderlist record);

    int insertSelective(Salesorderlist record);

    List<Salesorderlist> selectByExample(SalesorderlistExample example);

    Salesorderlist selectByPrimaryKey(Integer ziid);

    int updateByExampleSelective(@Param("record") Salesorderlist record, @Param("example") SalesorderlistExample example);

    int updateByExample(@Param("record") Salesorderlist record, @Param("example") SalesorderlistExample example);

    int updateByPrimaryKeySelective(Salesorderlist record);

    int updateByPrimaryKey(Salesorderlist record);
    
    //按主表id查询
    @Select("select * from Salesorderlist where zuid=#{zuid}")
    List<Salesorderlist> selectzhuid(@Param("zuid") String zuid);
    
    List<Salesorderlist> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Salesorderlist WHERE sol_custom1=#{billdate}")
   String getno(@Param("billdate")String billdate);
	
	List<Salesorderlist> selectquerybysolId(String solId);
	
   int deleteByPrimaryKey(String solId);

   List<Salesorderlist> selectByPrimaryKey(String solId);


}