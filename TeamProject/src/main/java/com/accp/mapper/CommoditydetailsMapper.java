package com.accp.mapper;

import com.accp.domain.Commoditydetails;
import com.accp.domain.CommoditydetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommoditydetailsMapper {
    int countByExample(CommoditydetailsExample example);

    int deleteByExample(CommoditydetailsExample example);

    int deleteByPrimaryKey(Integer cdid);

    int insert(Commoditydetails record);

    int insertSelective(Commoditydetails record);

    List<Commoditydetails> selectByExample(CommoditydetailsExample example);

    Commoditydetails selectByPrimaryKey(Integer cdid);

    int updateByExampleSelective(@Param("record") Commoditydetails record, @Param("example") CommoditydetailsExample example);

    int updateByExample(@Param("record") Commoditydetails record, @Param("example") CommoditydetailsExample example);

    int updateByPrimaryKeySelective(Commoditydetails record);

    int updateByPrimaryKey(Commoditydetails record);
}