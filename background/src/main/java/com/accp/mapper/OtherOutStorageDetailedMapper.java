package com.accp.mapper;

import com.accp.domain.OtherOutStorageDetailed;
import com.accp.domain.OtherOutStorageDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtherOutStorageDetailedMapper {
    int countByExample(OtherOutStorageDetailedExample example);

    int deleteByExample(OtherOutStorageDetailedExample example);

    int deleteByPrimaryKey(String oosdId);

    int insert(OtherOutStorageDetailed record);

    int insertSelective(OtherOutStorageDetailed record);

    List<OtherOutStorageDetailed> selectByExample(OtherOutStorageDetailedExample example);

    OtherOutStorageDetailed selectByPrimaryKey(String oosdId);

    int updateByExampleSelective(@Param("record") OtherOutStorageDetailed record, @Param("example") OtherOutStorageDetailedExample example);

    int updateByExample(@Param("record") OtherOutStorageDetailed record, @Param("example") OtherOutStorageDetailedExample example);

    int updateByPrimaryKeySelective(OtherOutStorageDetailed record);

    int updateByPrimaryKey(OtherOutStorageDetailed record);
}