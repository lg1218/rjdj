package com.accp.mapper;

import com.accp.domain.AdjustPrice;
import com.accp.domain.AdjustPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdjustPriceMapper {
    int countByExample(AdjustPriceExample example);

    int deleteByExample(AdjustPriceExample example);

    int deleteByPrimaryKey(String apId);

    int insert(AdjustPrice record);

    int insertSelective(AdjustPrice record);

    List<AdjustPrice> selectByExample(AdjustPriceExample example);

    AdjustPrice selectByPrimaryKey(String apId);

    int updateByExampleSelective(@Param("record") AdjustPrice record, @Param("example") AdjustPriceExample example);

    int updateByExample(@Param("record") AdjustPrice record, @Param("example") AdjustPriceExample example);

    int updateByPrimaryKeySelective(AdjustPrice record);

    int updateByPrimaryKey(AdjustPrice record);
}