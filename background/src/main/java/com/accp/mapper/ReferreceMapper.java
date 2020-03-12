package com.accp.mapper;

import com.accp.domain.Referrece;
import com.accp.domain.ReferreceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReferreceMapper {
    int countByExample(ReferreceExample example);

    int deleteByExample(ReferreceExample example);

    int deleteByPrimaryKey(String referreceId);

    int insert(Referrece record);

    int insertSelective(Referrece record);

    List<Referrece> selectByExample(ReferreceExample example);

    Referrece selectByPrimaryKey(String referreceId);

    int updateByExampleSelective(@Param("record") Referrece record, @Param("example") ReferreceExample example);

    int updateByExample(@Param("record") Referrece record, @Param("example") ReferreceExample example);

    int updateByPrimaryKeySelective(Referrece record);

    int updateByPrimaryKey(Referrece record);
}