package com.accp.mapper;

import com.accp.domain.SSellOut;
import com.accp.domain.SSellOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SSellOutMapper {
    int countByExample(SSellOutExample example);

    int deleteByExample(SSellOutExample example);

    int deleteByPrimaryKey(String ouNumber);

    int insert(SSellOut record);

    int insertSelective(SSellOut record);

    List<SSellOut> selectByExample(SSellOutExample example);

    SSellOut selectByPrimaryKey(String ouNumber);

    int updateByExampleSelective(@Param("record") SSellOut record, @Param("example") SSellOutExample example);

    int updateByExample(@Param("record") SSellOut record, @Param("example") SSellOutExample example);

    int updateByPrimaryKeySelective(SSellOut record);

    int updateByPrimaryKey(SSellOut record);
}