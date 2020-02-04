package com.accp.mapper;

import com.accp.domain.TPurchaseOrderDetails;
import com.accp.domain.TPurchaseOrderDetailsExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseOrderDetailsMapper {
    int countByExample(TPurchaseOrderDetailsExample example);

    int deleteByExample(TPurchaseOrderDetailsExample example);

    int deleteByPrimaryKey(Date prodid);

    int insert(TPurchaseOrderDetails record);

    int insertSelective(TPurchaseOrderDetails record);

    List<TPurchaseOrderDetails> selectByExample(TPurchaseOrderDetailsExample example);

    TPurchaseOrderDetails selectByPrimaryKey(Date prodid);

    int updateByExampleSelective(@Param("record") TPurchaseOrderDetails record, @Param("example") TPurchaseOrderDetailsExample example);

    int updateByExample(@Param("record") TPurchaseOrderDetails record, @Param("example") TPurchaseOrderDetailsExample example);

    int updateByPrimaryKeySelective(TPurchaseOrderDetails record);

    int updateByPrimaryKey(TPurchaseOrderDetails record);
}