package com.accp.mapper;

import com.accp.domain.OtherOutStorage;
import com.accp.domain.OtherOutStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtherOutStorageMapper {
    int countByExample(OtherOutStorageExample example);

    int deleteByExample(OtherOutStorageExample example);

    int deleteByPrimaryKey(String oosId);

    int insert(OtherOutStorage record);

    int insertSelective(OtherOutStorage record);

    List<OtherOutStorage> selectByExample(OtherOutStorageExample example);

    OtherOutStorage selectByPrimaryKey(String oosId);

    int updateByExampleSelective(@Param("record") OtherOutStorage record, @Param("example") OtherOutStorageExample example);

    int updateByExample(@Param("record") OtherOutStorage record, @Param("example") OtherOutStorageExample example);

    int updateByPrimaryKeySelective(OtherOutStorage record);

    int updateByPrimaryKey(OtherOutStorage record);
}