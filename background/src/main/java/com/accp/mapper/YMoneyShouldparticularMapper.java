package com.accp.mapper;

import com.accp.domain.YMoneyShouldparticular;
import com.accp.domain.YMoneyShouldparticularExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMoneyShouldparticularMapper {
    int countByExample(YMoneyShouldparticularExample example);

    int deleteByExample(YMoneyShouldparticularExample example);

    int deleteByPrimaryKey(String id);

    int insert(YMoneyShouldparticular record);

    int insertSelective(YMoneyShouldparticular record);

    List<YMoneyShouldparticular> selectByExample(YMoneyShouldparticularExample example);

    YMoneyShouldparticular selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") YMoneyShouldparticular record, @Param("example") YMoneyShouldparticularExample example);

    int updateByExample(@Param("record") YMoneyShouldparticular record, @Param("example") YMoneyShouldparticularExample example);

    int updateByPrimaryKeySelective(YMoneyShouldparticular record);

    int updateByPrimaryKey(YMoneyShouldparticular record);
}