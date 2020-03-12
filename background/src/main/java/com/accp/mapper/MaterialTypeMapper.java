package com.accp.mapper;

import com.accp.domain.MaterialType;
import com.accp.domain.MaterialTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialTypeMapper {
    int countByExample(MaterialTypeExample example);

    int deleteByExample(MaterialTypeExample example);

    int deleteByPrimaryKey(String mtId);

    int insert(MaterialType record);

    int insertSelective(MaterialType record);

    List<MaterialType> selectByExample(MaterialTypeExample example);

    MaterialType selectByPrimaryKey(String mtId);

    int updateByExampleSelective(@Param("record") MaterialType record, @Param("example") MaterialTypeExample example);

    int updateByExample(@Param("record") MaterialType record, @Param("example") MaterialTypeExample example);

    int updateByPrimaryKeySelective(MaterialType record);

    int updateByPrimaryKey(MaterialType record);
}