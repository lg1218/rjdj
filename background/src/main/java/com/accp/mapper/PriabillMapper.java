package com.accp.mapper;

import com.accp.domain.Priabill;
import com.accp.domain.PriabillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriabillMapper {
    int countByExample(PriabillExample example);

    int deleteByExample(PriabillExample example);

    int deleteByPrimaryKey(String priabillId);

    int insert(Priabill record);

    int insertSelective(Priabill record);

    List<Priabill> selectByExample(PriabillExample example);

    Priabill selectByPrimaryKey(String priabillId);

    int updateByExampleSelective(@Param("record") Priabill record, @Param("example") PriabillExample example);

    int updateByExample(@Param("record") Priabill record, @Param("example") PriabillExample example);

    int updateByPrimaryKeySelective(Priabill record);

    int updateByPrimaryKey(Priabill record);
}