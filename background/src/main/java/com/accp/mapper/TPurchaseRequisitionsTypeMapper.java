package com.accp.mapper;

import com.accp.domain.TPurchaseRequisitionsType;
import com.accp.domain.TPurchaseRequisitionsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseRequisitionsTypeMapper {
    int countByExample(TPurchaseRequisitionsTypeExample example);

    int deleteByExample(TPurchaseRequisitionsTypeExample example);

    int deleteByPrimaryKey(String classid);

    int insert(TPurchaseRequisitionsType record);

    int insertSelective(TPurchaseRequisitionsType record);

    List<TPurchaseRequisitionsType> selectByExample(TPurchaseRequisitionsTypeExample example);

    TPurchaseRequisitionsType selectByPrimaryKey(String classid);

    int updateByExampleSelective(@Param("record") TPurchaseRequisitionsType record, @Param("example") TPurchaseRequisitionsTypeExample example);

    int updateByExample(@Param("record") TPurchaseRequisitionsType record, @Param("example") TPurchaseRequisitionsTypeExample example);

    int updateByPrimaryKeySelective(TPurchaseRequisitionsType record);

    int updateByPrimaryKey(TPurchaseRequisitionsType record);
}