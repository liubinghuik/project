package com.accp.mapper;

import com.accp.domain.Commoditysort;
import com.accp.domain.CommoditysortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommoditysortMapper {
    int countByExample(CommoditysortExample example);

    int deleteByExample(CommoditysortExample example);

    int deleteByPrimaryKey(Integer csid);

    int insert(Commoditysort record);

    int insertSelective(Commoditysort record);

    List<Commoditysort> selectByExample(CommoditysortExample example);

    Commoditysort selectByPrimaryKey(Integer csid);

    int updateByExampleSelective(@Param("record") Commoditysort record, @Param("example") CommoditysortExample example);

    int updateByExample(@Param("record") Commoditysort record, @Param("example") CommoditysortExample example);

    int updateByPrimaryKeySelective(Commoditysort record);

    int updateByPrimaryKey(Commoditysort record);
}