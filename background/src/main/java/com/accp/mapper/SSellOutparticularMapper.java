package com.accp.mapper;

import com.accp.domain.SSellOutparticular;
import com.accp.domain.SSellOutparticularExample;
import com.accp.domain.SSellOutparticularKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SSellOutparticularMapper {
    int countByExample(SSellOutparticularExample example);

    int deleteByExample(SSellOutparticularExample example);

    int deleteByPrimaryKey(SSellOutparticularKey key);

    int insert(SSellOutparticular record);

    int insertSelective(SSellOutparticular record);

    List<SSellOutparticular> selectByExample(SSellOutparticularExample example);

    SSellOutparticular selectByPrimaryKey(SSellOutparticularKey key);

    int updateByExampleSelective(@Param("record") SSellOutparticular record, @Param("example") SSellOutparticularExample example);

    int updateByExample(@Param("record") SSellOutparticular record, @Param("example") SSellOutparticularExample example);

    int updateByPrimaryKeySelective(SSellOutparticular record);

    int updateByPrimaryKey(SSellOutparticular record);
}