package com.accp.mapper;

import com.accp.domain.BillnotPurchaseRequisitions;
import com.accp.domain.BillnotPurchaseRequisitionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillnotPurchaseRequisitionsMapper {
    int countByExample(BillnotPurchaseRequisitionsExample example);

    int deleteByExample(BillnotPurchaseRequisitionsExample example);

    int deleteByPrimaryKey(String billno);

    int insert(BillnotPurchaseRequisitions record);

    int insertSelective(BillnotPurchaseRequisitions record);

    List<BillnotPurchaseRequisitions> selectByExample(BillnotPurchaseRequisitionsExample example);

    BillnotPurchaseRequisitions selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") BillnotPurchaseRequisitions record, @Param("example") BillnotPurchaseRequisitionsExample example);

    int updateByExample(@Param("record") BillnotPurchaseRequisitions record, @Param("example") BillnotPurchaseRequisitionsExample example);

    int updateByPrimaryKeySelective(BillnotPurchaseRequisitions record);

    int updateByPrimaryKey(BillnotPurchaseRequisitions record);
}