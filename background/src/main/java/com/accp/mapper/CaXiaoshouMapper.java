package com.accp.mapper;

import com.accp.domain.CaXiaoshou;
import com.accp.domain.CaXiaoshouExample;
import com.accp.domain.CaXiaoshouKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaXiaoshouMapper {
    int countByExample(CaXiaoshouExample example);

    int deleteByExample(CaXiaoshouExample example);

    int deleteByPrimaryKey(CaXiaoshouKey key);

    int insert(CaXiaoshou record);

    int insertSelective(CaXiaoshou record);

    List<CaXiaoshou> selectByExample(CaXiaoshouExample example);

    CaXiaoshou selectByPrimaryKey(CaXiaoshouKey key);

    int updateByExampleSelective(@Param("record") CaXiaoshou record, @Param("example") CaXiaoshouExample example);

    int updateByExample(@Param("record") CaXiaoshou record, @Param("example") CaXiaoshouExample example);

    int updateByPrimaryKeySelective(CaXiaoshou record);

    int updateByPrimaryKey(CaXiaoshou record);
}