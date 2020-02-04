package com.accp.mapper;

import com.accp.domain.YAdvancemain;
import com.accp.domain.YAdvancemainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YAdvancemainMapper {
    int countByExample(YAdvancemainExample example);

    int deleteByExample(YAdvancemainExample example);

    int insert(YAdvancemain record);

    int insertSelective(YAdvancemain record);

    List<YAdvancemain> selectByExample(YAdvancemainExample example);

    int updateByExampleSelective(@Param("record") YAdvancemain record, @Param("example") YAdvancemainExample example);

    int updateByExample(@Param("record") YAdvancemain record, @Param("example") YAdvancemainExample example);
}