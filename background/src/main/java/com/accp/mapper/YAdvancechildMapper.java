package com.accp.mapper;

import com.accp.domain.YAdvancechild;
import com.accp.domain.YAdvancechildExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YAdvancechildMapper {
    int countByExample(YAdvancechildExample example);

    int deleteByExample(YAdvancechildExample example);

    int insert(YAdvancechild record);

    int insertSelective(YAdvancechild record);

    List<YAdvancechild> selectByExample(YAdvancechildExample example);

    int updateByExampleSelective(@Param("record") YAdvancechild record, @Param("example") YAdvancechildExample example);

    int updateByExample(@Param("record") YAdvancechild record, @Param("example") YAdvancechildExample example);
}