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


@Controller
@RequestMapping("/commodityAll")
public class CommodityAllController {
	@Autowired
	CommodityAllService commodityallservice;
	@Autowired
	ShopAllService shopallservice;
	
	@RequestMapping("/toselectall")
	@ResponseBody
	public List<CommodityAll> selectcommodityByAllqmn(String uaccount){
		return commodityallservice.selectcommodityByAllqmn(uaccount);
	}
	@RequestMapping("/toseleectBycsid")
	@ResponseBody
	public List<CommodityAll> selectcommodityBycsnameqmn(String csname){
		return commodityallservice.selectcommodityBycsnameqmn(csname);
	}
	@RequestMapping("/toselectyyy")
	@ResponseBody
	public List<ShopAll> selectstaffByreception(){
		return shopallservice.selectstaffByreception();
	}
}
