package com.accp.mapper;

import com.accp.domain.TPurchaseOrder;
import com.accp.domain.TPurchaseOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseOrderMapper {
    int countByExample(TPurchaseOrderExample example);

    int deleteByExample(TPurchaseOrderExample example);

    int deleteByPrimaryKey(String billno);

    int insert(TPurchaseOrder record);

    int insertSelective(TPurchaseOrder record);

    List<TPurchaseOrder> selectByExample(TPurchaseOrderExample example);

    TPurchaseOrder selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") TPurchaseOrder record, @Param("example") TPurchaseOrderExample example);

    int updateByExample(@Param("record") TPurchaseOrder record, @Param("example") TPurchaseOrderExample example);

    int updateByPrimaryKeySelective(TPurchaseOrder record);

    int updateByPrimaryKey(TPurchaseOrder record);
}