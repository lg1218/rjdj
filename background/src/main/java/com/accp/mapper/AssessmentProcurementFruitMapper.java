package com.accp.mapper;

import com.accp.domain.AssessmentProcurementFruit;
import com.accp.domain.AssessmentProcurementFruitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessmentProcurementFruitMapper {
    int countByExample(AssessmentProcurementFruitExample example);

    int deleteByExample(AssessmentProcurementFruitExample example);

    int deleteByPrimaryKey(String apfId);

    int insert(AssessmentProcurementFruit record);

    int insertSelective(AssessmentProcurementFruit record);

    List<AssessmentProcurementFruit> selectByExample(AssessmentProcurementFruitExample example);

    AssessmentProcurementFruit selectByPrimaryKey(String apfId);

    int updateByExampleSelective(@Param("record") AssessmentProcurementFruit record, @Param("example") AssessmentProcurementFruitExample example);

    int updateByExample(@Param("record") AssessmentProcurementFruit record, @Param("example") AssessmentProcurementFruitExample example);

    int updateByPrimaryKeySelective(AssessmentProcurementFruit record);

    int updateByPrimaryKey(AssessmentProcurementFruit record);
}