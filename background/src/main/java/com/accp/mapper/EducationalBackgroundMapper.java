package com.accp.mapper;

import com.accp.domain.EducationalBackground;
import com.accp.domain.EducationalBackgroundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationalBackgroundMapper {
    int countByExample(EducationalBackgroundExample example);

    int deleteByExample(EducationalBackgroundExample example);

    int deleteByPrimaryKey(String ebId);

    int insert(EducationalBackground record);

    int insertSelective(EducationalBackground record);

    List<EducationalBackground> selectByExample(EducationalBackgroundExample example);

    EducationalBackground selectByPrimaryKey(String ebId);

    int updateByExampleSelective(@Param("record") EducationalBackground record, @Param("example") EducationalBackgroundExample example);

    int updateByExample(@Param("record") EducationalBackground record, @Param("example") EducationalBackgroundExample example);

    int updateByPrimaryKeySelective(EducationalBackground record);

    int updateByPrimaryKey(EducationalBackground record);
}