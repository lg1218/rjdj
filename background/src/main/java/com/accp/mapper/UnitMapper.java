package com.accp.mapper;

import com.accp.domain.Unit;
import com.accp.domain.UnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitMapper {
    int countByExample(UnitExample example);

    int deleteByExample(UnitExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(Unit record);

    int insertSelective(Unit record);

    List<Unit> selectByExample(UnitExample example);

    Unit selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByExample(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}