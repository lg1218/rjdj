package com.accp.mapper;

import com.accp.domain.Priadetails;
import com.accp.domain.PriadetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriadetailsMapper {
    int countByExample(PriadetailsExample example);

    int deleteByExample(PriadetailsExample example);

    int deleteByPrimaryKey(String priadetailsId);

    int insert(Priadetails record);

    int insertSelective(Priadetails record);

    List<Priadetails> selectByExample(PriadetailsExample example);

    Priadetails selectByPrimaryKey(String priadetailsId);

    int updateByExampleSelective(@Param("record") Priadetails record, @Param("example") PriadetailsExample example);

    int updateByExample(@Param("record") Priadetails record, @Param("example") PriadetailsExample example);

    int updateByPrimaryKeySelective(Priadetails record);

    int updateByPrimaryKey(Priadetails record);
}