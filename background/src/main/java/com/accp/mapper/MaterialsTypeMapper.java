package com.accp.mapper;

import com.accp.domain.MaterialsType;
import com.accp.domain.MaterialsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialsTypeMapper {
    int countByExample(MaterialsTypeExample example);

    int deleteByExample(MaterialsTypeExample example);

    int insert(MaterialsType record);

    int insertSelective(MaterialsType record);

    List<MaterialsType> selectByExample(MaterialsTypeExample example);

    int updateByExampleSelective(@Param("record") MaterialsType record, @Param("example") MaterialsTypeExample example);

    int updateByExample(@Param("record") MaterialsType record, @Param("example") MaterialsTypeExample example);
}