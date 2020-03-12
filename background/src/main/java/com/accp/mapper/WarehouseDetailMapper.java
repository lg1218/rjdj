package com.accp.mapper;

import com.accp.domain.WarehouseDetail;
import com.accp.domain.WarehouseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseDetailMapper {
    int countByExample(WarehouseDetailExample example);

    int deleteByExample(WarehouseDetailExample example);

    int deleteByPrimaryKey(String wdId);

    int insert(WarehouseDetail record);

    int insertSelective(WarehouseDetail record);

    List<WarehouseDetail> selectByExample(WarehouseDetailExample example);

    WarehouseDetail selectByPrimaryKey(String wdId);

    int updateByExampleSelective(@Param("record") WarehouseDetail record, @Param("example") WarehouseDetailExample example);

    int updateByExample(@Param("record") WarehouseDetail record, @Param("example") WarehouseDetailExample example);

    int updateByPrimaryKeySelective(WarehouseDetail record);

    int updateByPrimaryKey(WarehouseDetail record);
}