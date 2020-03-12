package com.accp.mapper;

import com.accp.domain.SalesOutWarehouseType;
import com.accp.domain.SalesOutWarehouseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesOutWarehouseTypeMapper {
    int countByExample(SalesOutWarehouseTypeExample example);

    int deleteByExample(SalesOutWarehouseTypeExample example);

    int deleteByPrimaryKey(String sowtId);

    int insert(SalesOutWarehouseType record);

    int insertSelective(SalesOutWarehouseType record);

    List<SalesOutWarehouseType> selectByExample(SalesOutWarehouseTypeExample example);

    SalesOutWarehouseType selectByPrimaryKey(String sowtId);

    int updateByExampleSelective(@Param("record") SalesOutWarehouseType record, @Param("example") SalesOutWarehouseTypeExample example);

    int updateByExample(@Param("record") SalesOutWarehouseType record, @Param("example") SalesOutWarehouseTypeExample example);

    int updateByPrimaryKeySelective(SalesOutWarehouseType record);

    int updateByPrimaryKey(SalesOutWarehouseType record);
}