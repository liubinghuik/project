package com.accp.mapper;

import java.util.List;

import com.accp.domain.CommodityAll;

public interface CommodityAllMapper {
	List<CommodityAll> selectcommodityByAllqmn(String uaccount);
	List<CommodityAll> selectcommodityBycsnameqmn(CommodityAll commodityall);
	int updatecommoditydetailskc(CommodityAll commodityall);
}
