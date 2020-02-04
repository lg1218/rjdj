package com.accp.mapper;

import com.accp.domain.YPayformain;
import com.accp.domain.YPayformainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YPayformainMapper {
    int countByExample(YPayformainExample example);

    int deleteByExample(YPayformainExample example);

    int insert(YPayformain record);

    int insertSelective(YPayformain record);

    List<YPayformain> selectByExample(YPayformainExample example);

    int updateByExampleSelective(@Param("record") YPayformain record, @Param("example") YPayformainExample example);

    int updateByExample(@Param("record") YPayformain record, @Param("example") YPayformainExample example);
}