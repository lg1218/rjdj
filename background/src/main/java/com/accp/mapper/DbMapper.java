package com.accp.mapper;

import com.accp.domain.Db;
import com.accp.domain.DbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbMapper {
    int countByExample(DbExample example);

    int deleteByExample(DbExample example);

    int deleteByPrimaryKey(String dbid);

    int insert(Db record);

    int insertSelective(Db record);

    List<Db> selectByExample(DbExample example);

    Db selectByPrimaryKey(String dbid);

    int updateByExampleSelective(@Param("record") Db record, @Param("example") DbExample example);

    int updateByExample(@Param("record") Db record, @Param("example") DbExample example);

    int updateByPrimaryKeySelective(Db record);

    int updateByPrimaryKey(Db record);
}