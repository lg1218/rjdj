package com.accp.mapper;

import com.accp.domain.CPayforcontent;
import com.accp.domain.CPayforcontentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CPayforcontentMapper {
    int countByExample(CPayforcontentExample example);

    int deleteByExample(CPayforcontentExample example);

    int insert(CPayforcontent record);

    int insertSelective(CPayforcontent record);

    List<CPayforcontent> selectByExample(CPayforcontentExample example);

    int updateByExampleSelective(@Param("record") CPayforcontent record, @Param("example") CPayforcontentExample example);

    int updateByExample(@Param("record") CPayforcontent record, @Param("example") CPayforcontentExample example);
}