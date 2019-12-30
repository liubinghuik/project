package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.CommodityAll;
import com.accp.mapper.CommodityAllMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CommodityAllService {
	@Autowired
	CommodityAllMapper commodityallmapper;
	//查询所有商品
	public List<CommodityAll> selectcommodityByAllqmn(String uaccount){
		List<CommodityAll> list=commodityallmapper.selectcommodityByAllqmn(uaccount);
		return list;
	}
	//根据csid查询商品
	public List<CommodityAll> selectcommodityBycsnameqmn(String csname){
		List<CommodityAll> list=commodityallmapper.selectcommodityBycsnameqmn(csname);
		return list;
	}
	public int updatecommoditydetailskc(CommodityAll commodityall){
		return commodityallmapper.updatecommoditydetailskc(commodityall);
	}
	
}
