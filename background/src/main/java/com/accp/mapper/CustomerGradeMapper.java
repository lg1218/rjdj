package com.accp.mapper;

import com.accp.domain.CustomerGrade;
import com.accp.domain.CustomerGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerGradeMapper {
    int countByExample(CustomerGradeExample example);

    int deleteByExample(CustomerGradeExample example);

    int deleteByPrimaryKey(String cgId);

    int insert(CustomerGrade record);

    int insertSelective(CustomerGrade record);

    List<CustomerGrade> selectByExample(CustomerGradeExample example);

    CustomerGrade selectByPrimaryKey(String cgId);

    int updateByExampleSelective(@Param("record") CustomerGrade record, @Param("example") CustomerGradeExample example);

    int updateByExample(@Param("record") CustomerGrade record, @Param("example") CustomerGradeExample example);

    int updateByPrimaryKeySelective(CustomerGrade record);

    int updateByPrimaryKey(CustomerGrade record);
}