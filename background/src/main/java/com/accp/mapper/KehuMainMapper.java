package com.accp.mapper;

import com.accp.domain.KehuMain;
import com.accp.domain.KehuMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KehuMainMapper {
    int countByExample(KehuMainExample example);

    int deleteByExample(KehuMainExample example);

    int deleteByPrimaryKey(Integer khid);

    int insert(KehuMain record);

    int insertSelective(KehuMain record);

    List<KehuMain> selectByExample(KehuMainExample example);

    KehuMain selectByPrimaryKey(Integer khid);

    int updateByExampleSelective(@Param("record") KehuMain record, @Param("example") KehuMainExample example);

    int updateByExample(@Param("record") KehuMain record, @Param("example") KehuMainExample example);

    int updateByPrimaryKeySelective(KehuMain record);

    int updateByPrimaryKey(KehuMain record);
}