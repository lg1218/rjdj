package com.accp.mapper;

import com.accp.domain.PCheckMemu;
import com.accp.domain.PCheckMemuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PCheckMemuMapper {
    int countByExample(PCheckMemuExample example);

    int deleteByExample(PCheckMemuExample example);

    int deleteByPrimaryKey(String meBillno);

    int insert(PCheckMemu record);

    int insertSelective(PCheckMemu record);

    List<PCheckMemu> selectByExample(PCheckMemuExample example);

    PCheckMemu selectByPrimaryKey(String meBillno);

    int updateByExampleSelective(@Param("record") PCheckMemu record, @Param("example") PCheckMemuExample example);

    int updateByExample(@Param("record") PCheckMemu record, @Param("example") PCheckMemuExample example);

    int updateByPrimaryKeySelective(PCheckMemu record);

    int updateByPrimaryKey(PCheckMemu record);
}