package com.accp.mapper;

import com.accp.domain.OtherInputStorage;
import com.accp.domain.OtherInputStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtherInputStorageMapper {
    int countByExample(OtherInputStorageExample example);

    int deleteByExample(OtherInputStorageExample example);

    int deleteByPrimaryKey(String oisId);

    int insert(OtherInputStorage record);

    int insertSelective(OtherInputStorage record);

    List<OtherInputStorage> selectByExample(OtherInputStorageExample example);

    OtherInputStorage selectByPrimaryKey(String oisId);

    int updateByExampleSelective(@Param("record") OtherInputStorage record, @Param("example") OtherInputStorageExample example);

    int updateByExample(@Param("record") OtherInputStorage record, @Param("example") OtherInputStorageExample example);

    int updateByPrimaryKeySelective(OtherInputStorage record);

    int updateByPrimaryKey(OtherInputStorage record);
}