package com.accp.mapper;

import com.accp.domain.SubjectBlanketCategory;
import com.accp.domain.SubjectBlanketCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectBlanketCategoryMapper {
    int countByExample(SubjectBlanketCategoryExample example);

    int deleteByExample(SubjectBlanketCategoryExample example);

    int deleteByPrimaryKey(String sbcId);

    int insert(SubjectBlanketCategory record);

    int insertSelective(SubjectBlanketCategory record);

    List<SubjectBlanketCategory> selectByExample(SubjectBlanketCategoryExample example);

    SubjectBlanketCategory selectByPrimaryKey(String sbcId);

    int updateByExampleSelective(@Param("record") SubjectBlanketCategory record, @Param("example") SubjectBlanketCategoryExample example);

    int updateByExample(@Param("record") SubjectBlanketCategory record, @Param("example") SubjectBlanketCategoryExample example);

    int updateByPrimaryKeySelective(SubjectBlanketCategory record);

    int updateByPrimaryKey(SubjectBlanketCategory record);
}