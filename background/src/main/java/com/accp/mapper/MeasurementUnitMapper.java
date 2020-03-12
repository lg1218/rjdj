package com.accp.mapper;

import com.accp.domain.MeasurementUnit;
import com.accp.domain.MeasurementUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeasurementUnitMapper {
    int countByExample(MeasurementUnitExample example);

    int deleteByExample(MeasurementUnitExample example);

    int deleteByPrimaryKey(String muId);

    int insert(MeasurementUnit record);

    int insertSelective(MeasurementUnit record);

    List<MeasurementUnit> selectByExample(MeasurementUnitExample example);

    MeasurementUnit selectByPrimaryKey(String muId);

    int updateByExampleSelective(@Param("record") MeasurementUnit record, @Param("example") MeasurementUnitExample example);

    int updateByExample(@Param("record") MeasurementUnit record, @Param("example") MeasurementUnitExample example);

    int updateByPrimaryKeySelective(MeasurementUnit record);

    int updateByPrimaryKey(MeasurementUnit record);
}