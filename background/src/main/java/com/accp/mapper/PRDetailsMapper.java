package com.accp.mapper;

import com.accp.domain.PRDetails;
import com.accp.domain.PRDetailsExample;
import com.accp.domain.PRDetailsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PRDetailsMapper {
    int countByExample(PRDetailsExample example);

    int deleteByExample(PRDetailsExample example);

    int deleteByPrimaryKey(PRDetailsKey key);

    int insert(PRDetails record);

    int insertSelective(PRDetails record);

    List<PRDetails> selectByExample(PRDetailsExample example);

    PRDetails selectByPrimaryKey(PRDetailsKey key);

    int updateByExampleSelective(@Param("record") PRDetails record, @Param("example") PRDetailsExample example);

    int updateByExample(@Param("record") PRDetails record, @Param("example") PRDetailsExample example);

    int updateByPrimaryKeySelective(PRDetails record);

    int updateByPrimaryKey(PRDetails record);
}