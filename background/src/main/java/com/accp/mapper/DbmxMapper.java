package com.accp.mapper;

import com.accp.domain.Dbmx;
import com.accp.domain.DbmxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbmxMapper {
    int countByExample(DbmxExample example);

    int deleteByExample(DbmxExample example);

    int deleteByPrimaryKey(Integer dbmxid);

    int insert(Dbmx record);

    int insertSelective(Dbmx record);

    List<Dbmx> selectByExample(DbmxExample example);

    Dbmx selectByPrimaryKey(Integer dbmxid);

    int updateByExampleSelective(@Param("record") Dbmx record, @Param("example") DbmxExample example);

    int updateByExample(@Param("record") Dbmx record, @Param("example") DbmxExample example);

    int updateByPrimaryKeySelective(Dbmx record);

    int updateByPrimaryKey(Dbmx record);
}