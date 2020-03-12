package com.accp.mapper;

import com.accp.domain.Referpria;
import com.accp.domain.ReferpriaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReferpriaMapper {
    int countByExample(ReferpriaExample example);

    int deleteByExample(ReferpriaExample example);

    int deleteByPrimaryKey(String referpriaId);

    int insert(Referpria record);

    int insertSelective(Referpria record);

    List<Referpria> selectByExample(ReferpriaExample example);

    Referpria selectByPrimaryKey(String referpriaId);

    int updateByExampleSelective(@Param("record") Referpria record, @Param("example") ReferpriaExample example);

    int updateByExample(@Param("record") Referpria record, @Param("example") ReferpriaExample example);

    int updateByPrimaryKeySelective(Referpria record);

    int updateByPrimaryKey(Referpria record);
}