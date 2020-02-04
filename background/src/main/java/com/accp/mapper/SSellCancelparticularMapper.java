package com.accp.mapper;

import com.accp.domain.SSellCancelparticular;
import com.accp.domain.SSellCancelparticularExample;
import com.accp.domain.SSellCancelparticularKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SSellCancelparticularMapper {
    int countByExample(SSellCancelparticularExample example);

    int deleteByExample(SSellCancelparticularExample example);

    int deleteByPrimaryKey(SSellCancelparticularKey key);

    int insert(SSellCancelparticular record);

    int insertSelective(SSellCancelparticular record);

    List<SSellCancelparticular> selectByExample(SSellCancelparticularExample example);

    SSellCancelparticular selectByPrimaryKey(SSellCancelparticularKey key);

    int updateByExampleSelective(@Param("record") SSellCancelparticular record, @Param("example") SSellCancelparticularExample example);

    int updateByExample(@Param("record") SSellCancelparticular record, @Param("example") SSellCancelparticularExample example);

    int updateByPrimaryKeySelective(SSellCancelparticular record);

    int updateByPrimaryKey(SSellCancelparticular record);
}