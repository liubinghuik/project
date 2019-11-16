package com.accp.mapper;

import com.accp.domain.Shopcommodity;
import com.accp.domain.ShopcommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopcommodityMapper {
    int countByExample(ShopcommodityExample example);

    int deleteByExample(ShopcommodityExample example);

    int insert(Shopcommodity record);

    int insertSelective(Shopcommodity record);

    List<Shopcommodity> selectByExample(ShopcommodityExample example);

    int updateByExampleSelective(@Param("record") Shopcommodity record, @Param("example") ShopcommodityExample example);

    int updateByExample(@Param("record") Shopcommodity record, @Param("example") ShopcommodityExample example);
}