package com.accp.mapper;

import com.accp.domain.Salesorder;
import com.accp.domain.SalesorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SalesorderMapper {
	
	List<Salesorder> selectAll();
	
	List<Salesorder> selectAllbypage();
	
	
	@Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Salesorder WHERE so_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int countByExample(SalesorderExample example);

    int deleteByExample(SalesorderExample example);

    int deleteByPrimaryKey(String soId);

    int insert(Salesorder record);

    int insertSelective(Salesorder record);

    List<Salesorder> selectByExample(SalesorderExample example);

    Salesorder selectByPrimaryKey(String soId);

    int updateByExampleSelective(@Param("record") Salesorder record, @Param("example") SalesorderExample example);

    int updateByExample(@Param("record") Salesorder record, @Param("example") SalesorderExample example);

    int updateByPrimaryKeySelective(Salesorder record);

    int updateByPrimaryKey(Salesorder record);
    
    //按时间查询销售询价单
    @Select("SELECT * FROM salesorder WHERE so_document_time>=#{data1} AND so_document_time<=#{data2}")
    List<Salesorder> seleBytime(@Param("data1") String data1,@Param("data2") String data2);
    
}