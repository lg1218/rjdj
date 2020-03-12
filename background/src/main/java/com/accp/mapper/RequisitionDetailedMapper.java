package com.accp.mapper;

import com.accp.domain.RequisitionDetailed;
import com.accp.domain.RequisitionDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequisitionDetailedMapper {
    int countByExample(RequisitionDetailedExample example);

    int deleteByExample(RequisitionDetailedExample example);

    int deleteByPrimaryKey(String rdId);

    int insert(RequisitionDetailed record);

    int insertSelective(RequisitionDetailed record);

    List<RequisitionDetailed> selectByExampleWithBLOBs(RequisitionDetailedExample example);

    List<RequisitionDetailed> selectByExample(RequisitionDetailedExample example);

    RequisitionDetailed selectByPrimaryKey(String rdId);

    int updateByExampleSelective(@Param("record") RequisitionDetailed record, @Param("example") RequisitionDetailedExample example);

    int updateByExampleWithBLOBs(@Param("record") RequisitionDetailed record, @Param("example") RequisitionDetailedExample example);

    int updateByExample(@Param("record") RequisitionDetailed record, @Param("example") RequisitionDetailedExample example);

    int updateByPrimaryKeySelective(RequisitionDetailed record);

    int updateByPrimaryKeyWithBLOBs(RequisitionDetailed record);

    int updateByPrimaryKey(RequisitionDetailed record);
}