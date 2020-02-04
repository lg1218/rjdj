package com.accp.mapper;

import com.accp.domain.MaterialsMain;
import com.accp.domain.MaterialsMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialsMainMapper {
    int countByExample(MaterialsMainExample example);

    int deleteByExample(MaterialsMainExample example);

    int deleteByPrimaryKey(Integer mmId);

    int insert(MaterialsMain record);

    int insertSelective(MaterialsMain record);

    List<MaterialsMain> selectByExample(MaterialsMainExample example);

    MaterialsMain selectByPrimaryKey(Integer mmId);

    int updateByExampleSelective(@Param("record") MaterialsMain record, @Param("example") MaterialsMainExample example);

    int updateByExample(@Param("record") MaterialsMain record, @Param("example") MaterialsMainExample example);

    int updateByPrimaryKeySelective(MaterialsMain record);

    int updateByPrimaryKey(MaterialsMain record);
}