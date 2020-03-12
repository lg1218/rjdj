package com.accp.mapper;

import com.accp.domain.SubjectCategory;
import com.accp.domain.SubjectCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectCategoryMapper {
    int countByExample(SubjectCategoryExample example);

    int deleteByExample(SubjectCategoryExample example);

    int deleteByPrimaryKey(String scId);

    int insert(SubjectCategory record);

    int insertSelective(SubjectCategory record);

    List<SubjectCategory> selectByExample(SubjectCategoryExample example);

    SubjectCategory selectByPrimaryKey(String scId);

    int updateByExampleSelective(@Param("record") SubjectCategory record, @Param("example") SubjectCategoryExample example);

    int updateByExample(@Param("record") SubjectCategory record, @Param("example") SubjectCategoryExample example);

    int updateByPrimaryKeySelective(SubjectCategory record);

    int updateByPrimaryKey(SubjectCategory record);
}