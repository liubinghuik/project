package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.ShopAll;
import com.accp.service.ShopAllService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/shopall")
public class ShopAllController {
	
	@Autowired
	ShopAllService shopallservice;
	//根据登录的账号查询对应的店铺信息
	@RequestMapping("/toselect")
	@ResponseBody
	public	List<ShopAll> selectshopByuaccount(String account){
		List<ShopAll> list=shopallservice.selectshopByuaccount(account);
		return list;
	}
	//根据登录的账号查询对应的员工信息
	@RequestMapping("/tostaffselect")
	@ResponseBody
	public List<ShopAll> selectStaffByuaccount(String account,int sid,int pid,String name){
		ShopAll shopall=new ShopAll(account,sid,pid,name);
		return shopallservice.selectStaffByuaccount(shopall);
	}
	
}
