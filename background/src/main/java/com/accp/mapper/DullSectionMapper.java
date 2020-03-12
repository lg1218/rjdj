package com.accp.mapper;

import com.accp.domain.DullSection;
import com.accp.domain.DullSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DullSectionMapper {
    int countByExample(DullSectionExample example);

    int deleteByExample(DullSectionExample example);

    int deleteByPrimaryKey(String dsId);

    int insert(DullSection record);

    int insertSelective(DullSection record);

    List<DullSection> selectByExample(DullSectionExample example);

    DullSection selectByPrimaryKey(String dsId);

    int updateByExampleSelective(@Param("record") DullSection record, @Param("example") DullSectionExample example);

    int updateByExample(@Param("record") DullSection record, @Param("example") DullSectionExample example);

    int updateByPrimaryKeySelective(DullSection record);

    int updateByPrimaryKey(DullSection record);
}