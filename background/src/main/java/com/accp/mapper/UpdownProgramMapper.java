package com.accp.mapper;

import com.accp.domain.UpdownProgram;
import com.accp.domain.UpdownProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpdownProgramMapper {
    int countByExample(UpdownProgramExample example);

    int deleteByExample(UpdownProgramExample example);

    int deleteByPrimaryKey(String upId);

    int insert(UpdownProgram record);

    int insertSelective(UpdownProgram record);

    List<UpdownProgram> selectByExample(UpdownProgramExample example);

    UpdownProgram selectByPrimaryKey(String upId);

    int updateByExampleSelective(@Param("record") UpdownProgram record, @Param("example") UpdownProgramExample example);

    int updateByExample(@Param("record") UpdownProgram record, @Param("example") UpdownProgramExample example);

    int updateByPrimaryKeySelective(UpdownProgram record);

    int updateByPrimaryKey(UpdownProgram record);
}