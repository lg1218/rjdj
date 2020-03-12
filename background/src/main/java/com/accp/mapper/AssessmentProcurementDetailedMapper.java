package com.accp.mapper;

import com.accp.domain.AssessmentProcurementDetailed;
import com.accp.domain.AssessmentProcurementDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessmentProcurementDetailedMapper {
    int countByExample(AssessmentProcurementDetailedExample example);

    int deleteByExample(AssessmentProcurementDetailedExample example);

    int deleteByPrimaryKey(String apdId);

    int insert(AssessmentProcurementDetailed record);

    int insertSelective(AssessmentProcurementDetailed record);

    List<AssessmentProcurementDetailed> selectByExample(AssessmentProcurementDetailedExample example);

    AssessmentProcurementDetailed selectByPrimaryKey(String apdId);

    int updateByExampleSelective(@Param("record") AssessmentProcurementDetailed record, @Param("example") AssessmentProcurementDetailedExample example);

    int updateByExample(@Param("record") AssessmentProcurementDetailed record, @Param("example") AssessmentProcurementDetailedExample example);

    int updateByPrimaryKeySelective(AssessmentProcurementDetailed record);

    int updateByPrimaryKey(AssessmentProcurementDetailed record);
}