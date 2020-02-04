package com.accp.mapper;

import com.accp.domain.PSMain;
import com.accp.domain.PSMainExample;
import com.accp.domain.PSMainKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PSMainMapper {
    int countByExample(PSMainExample example);

    int deleteByExample(PSMainExample example);

    int deleteByPrimaryKey(PSMainKey key);

    int insert(PSMain record);

    int insertSelective(PSMain record);

    List<PSMain> selectByExample(PSMainExample example);

    PSMain selectByPrimaryKey(PSMainKey key);

    int updateByExampleSelective(@Param("record") PSMain record, @Param("example") PSMainExample example);

    int updateByExample(@Param("record") PSMain record, @Param("example") PSMainExample example);

    int updateByPrimaryKeySelective(PSMain record);

    int updateByPrimaryKey(PSMain record);
}