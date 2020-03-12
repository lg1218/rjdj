package com.accp.mapper;

import com.accp.domain.Payablesmain;
import com.accp.domain.PayablesmainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayablesmainMapper {
    int countByExample(PayablesmainExample example);

    int deleteByExample(PayablesmainExample example);

    int deleteByPrimaryKey(String payablesmainId);

    int insert(Payablesmain record);

    int insertSelective(Payablesmain record);

    List<Payablesmain> selectByExample(PayablesmainExample example);

    Payablesmain selectByPrimaryKey(String payablesmainId);

    int updateByExampleSelective(@Param("record") Payablesmain record, @Param("example") PayablesmainExample example);

    int updateByExample(@Param("record") Payablesmain record, @Param("example") PayablesmainExample example);

    int updateByPrimaryKeySelective(Payablesmain record);

    int updateByPrimaryKey(Payablesmain record);
}