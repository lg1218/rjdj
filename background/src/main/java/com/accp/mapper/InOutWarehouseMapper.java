package com.accp.mapper;

import com.accp.domain.InOutWarehouse;
import com.accp.domain.InOutWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InOutWarehouseMapper {
    int countByExample(InOutWarehouseExample example);

    int deleteByExample(InOutWarehouseExample example);

    int deleteByPrimaryKey(Integer iowTypeId);

    int insert(InOutWarehouse record);

    int insertSelective(InOutWarehouse record);

    List<InOutWarehouse> selectByExample(InOutWarehouseExample example);

    InOutWarehouse selectByPrimaryKey(Integer iowTypeId);

    int updateByExampleSelective(@Param("record") InOutWarehouse record, @Param("example") InOutWarehouseExample example);

    int updateByExample(@Param("record") InOutWarehouse record, @Param("example") InOutWarehouseExample example);

    int updateByPrimaryKeySelective(InOutWarehouse record);

    int updateByPrimaryKey(InOutWarehouse record);
}