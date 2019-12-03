package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.CommodityAll;
import com.accp.domain.ShopAll;
import com.accp.service.CommodityAllService;
import com.accp.service.ShopAllService;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("/commodityAll")
public class CommodityAllController {
	@Autowired
	CommodityAllService commodityallservice;
	@Autowired
	ShopAllService shopallservice;
	
	@RequestMapping("/toselectall")
	@ResponseBody
	public PageInfo<CommodityAll> selectcommodityByAllqmn(int pageNum,String uaccount){
		return commodityallservice.selectcommodityByAllqmn(pageNum, uaccount);
	}
	@RequestMapping("/toseleectBycsid")
	@ResponseBody
	public PageInfo<CommodityAll> selectcommodityBycsnameqmn(int pageNum,String csname,String uaccount){
		CommodityAll cc=new CommodityAll(uaccount,csname);
		return commodityallservice.selectcommodityBycsnameqmn(pageNum, cc);
	}
	@RequestMapping("/toselectyyy")
	@ResponseBody
	public List<ShopAll> selectstaffByreception(){
		return shopallservice.selectstaffByreception();
	}
}
