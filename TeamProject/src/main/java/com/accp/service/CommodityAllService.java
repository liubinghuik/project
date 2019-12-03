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
	public PageInfo<CommodityAll> selectcommodityByAllqmn(int pageNum,String uaccount){
		PageHelper.startPage(pageNum, 6);
		List<CommodityAll> list=commodityallmapper.selectcommodityByAllqmn(uaccount);
		PageInfo<CommodityAll> page=new PageInfo<CommodityAll>(list);
		return page;
	}
	//根据csid查询商品
	public PageInfo<CommodityAll> selectcommodityBycsnameqmn(int pageNum,CommodityAll commodityall){
		PageHelper.startPage(pageNum, 6);
		List<CommodityAll> list=commodityallmapper.selectcommodityBycsnameqmn(commodityall);
		PageInfo<CommodityAll> page=new PageInfo<CommodityAll>(list);
		return page;
	}
	public int updatecommoditydetailskc(CommodityAll commodityall){
		return commodityallmapper.updatecommoditydetailskc(commodityall);
	}
	
}
