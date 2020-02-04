package com.accp.mapper;

import com.accp.domain.PSDetails;
import com.accp.domain.PSDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PSDetailsMapper {
    int countByExample(PSDetailsExample example);

    int deleteByExample(PSDetailsExample example);

    int deleteByPrimaryKey(Integer psdLineid);

    int insert(PSDetails record);

    int insertSelective(PSDetails record);

    List<PSDetails> selectByExample(PSDetailsExample example);

    PSDetails selectByPrimaryKey(Integer psdLineid);

    int updateByExampleSelective(@Param("record") PSDetails record, @Param("example") PSDetailsExample example);

    int updateByExample(@Param("record") PSDetails record, @Param("example") PSDetailsExample example);

    int updateByPrimaryKeySelective(PSDetails record);

    int updateByPrimaryKey(PSDetails record);
}