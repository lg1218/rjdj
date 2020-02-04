package com.accp.mapper;

import com.accp.domain.PRMain;
import com.accp.domain.PRMainExample;
import com.accp.domain.PRMainKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PRMainMapper {
    int countByExample(PRMainExample example);

    int deleteByExample(PRMainExample example);

    int deleteByPrimaryKey(PRMainKey key);

    int insert(PRMain record);

    int insertSelective(PRMain record);

    List<PRMain> selectByExample(PRMainExample example);

    PRMain selectByPrimaryKey(PRMainKey key);

    int updateByExampleSelective(@Param("record") PRMain record, @Param("example") PRMainExample example);

    int updateByExample(@Param("record") PRMain record, @Param("example") PRMainExample example);

    int updateByPrimaryKeySelective(PRMain record);

    int updateByPrimaryKey(PRMain record);
}