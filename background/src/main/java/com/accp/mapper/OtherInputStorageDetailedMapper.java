package com.accp.mapper;

import com.accp.domain.OtherInputStorageDetailed;
import com.accp.domain.OtherInputStorageDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtherInputStorageDetailedMapper {
    int countByExample(OtherInputStorageDetailedExample example);

    int deleteByExample(OtherInputStorageDetailedExample example);

    int deleteByPrimaryKey(String oisdId);

    int insert(OtherInputStorageDetailed record);

    int insertSelective(OtherInputStorageDetailed record);

    List<OtherInputStorageDetailed> selectByExample(OtherInputStorageDetailedExample example);

    OtherInputStorageDetailed selectByPrimaryKey(String oisdId);

    int updateByExampleSelective(@Param("record") OtherInputStorageDetailed record, @Param("example") OtherInputStorageDetailedExample example);

    int updateByExample(@Param("record") OtherInputStorageDetailed record, @Param("example") OtherInputStorageDetailedExample example);

    int updateByPrimaryKeySelective(OtherInputStorageDetailed record);

    int updateByPrimaryKey(OtherInputStorageDetailed record);
}