package com.accp.mapper;

import com.accp.domain.Cgft;
import com.accp.domain.CgftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgftMapper {
    int countByExample(CgftExample example);

    int deleteByExample(CgftExample example);

    int deleteByPrimaryKey(String cgftid);

    int insert(Cgft record);

    int insertSelective(Cgft record);

    List<Cgft> selectByExample(CgftExample example);

    Cgft selectByPrimaryKey(String cgftid);

    int updateByExampleSelective(@Param("record") Cgft record, @Param("example") CgftExample example);

    int updateByExample(@Param("record") Cgft record, @Param("example") CgftExample example);

    int updateByPrimaryKeySelective(Cgft record);

    int updateByPrimaryKey(Cgft record);
}