package com.accp.mapper;

import com.accp.domain.Cgftmx;
import com.accp.domain.CgftmxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgftmxMapper {
    int countByExample(CgftmxExample example);

    int deleteByExample(CgftmxExample example);

    int deleteByPrimaryKey(Integer cgftmxid);

    int insert(Cgftmx record);

    int insertSelective(Cgftmx record);

    List<Cgftmx> selectByExample(CgftmxExample example);

    Cgftmx selectByPrimaryKey(Integer cgftmxid);

    int updateByExampleSelective(@Param("record") Cgftmx record, @Param("example") CgftmxExample example);

    int updateByExample(@Param("record") Cgftmx record, @Param("example") CgftmxExample example);

    int updateByPrimaryKeySelective(Cgftmx record);

    int updateByPrimaryKey(Cgftmx record);
}