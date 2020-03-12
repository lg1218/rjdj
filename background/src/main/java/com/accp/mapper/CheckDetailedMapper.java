package com.accp.mapper;

import com.accp.domain.CheckDetailed;
import com.accp.domain.CheckDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckDetailedMapper {
    int countByExample(CheckDetailedExample example);

    int deleteByExample(CheckDetailedExample example);

    int deleteByPrimaryKey(String cdId);

    int insert(CheckDetailed record);

    int insertSelective(CheckDetailed record);

    List<CheckDetailed> selectByExample(CheckDetailedExample example);

    CheckDetailed selectByPrimaryKey(String cdId);

    int updateByExampleSelective(@Param("record") CheckDetailed record, @Param("example") CheckDetailedExample example);

    int updateByExample(@Param("record") CheckDetailed record, @Param("example") CheckDetailedExample example);

    int updateByPrimaryKeySelective(CheckDetailed record);

    int updateByPrimaryKey(CheckDetailed record);
}