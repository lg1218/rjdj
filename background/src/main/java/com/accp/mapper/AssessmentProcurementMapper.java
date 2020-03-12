package com.accp.mapper;

import com.accp.domain.AssessmentProcurement;
import com.accp.domain.AssessmentProcurementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessmentProcurementMapper {
    int countByExample(AssessmentProcurementExample example);

    int deleteByExample(AssessmentProcurementExample example);

    int deleteByPrimaryKey(String apId);

    int insert(AssessmentProcurement record);

    int insertSelective(AssessmentProcurement record);

    List<AssessmentProcurement> selectByExample(AssessmentProcurementExample example);

    AssessmentProcurement selectByPrimaryKey(String apId);

    int updateByExampleSelective(@Param("record") AssessmentProcurement record, @Param("example") AssessmentProcurementExample example);

    int updateByExample(@Param("record") AssessmentProcurement record, @Param("example") AssessmentProcurementExample example);

    int updateByPrimaryKeySelective(AssessmentProcurement record);

    int updateByPrimaryKey(AssessmentProcurement record);
}