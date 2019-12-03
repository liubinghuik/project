package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Shop;
import com.accp.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {
	@Autowired
	ShopService shopservice;
	
	//新增门店
	@RequestMapping("/toinsert")
	@ResponseBody
    public String insertShop(@RequestBody Shop shop) {
    	if(shopservice.insertShop(shop)>0) {
    		return "0";
    	}else {
    		return "1";
    	}
    }

	/* 根据id查询对应的门店信息 */
	@RequestMapping("/toselectBysid")
	@ResponseBody
    public Shop selectShopBysid(int sid) {
    	return shopservice.selectShopBysid(sid);
    }

	/* 修改门店信息 */
	@RequestMapping("/toupdate")
	@ResponseBody
    public String updateShop(@RequestBody Shop shop) {
    	if(shopservice.updateShop(shop)>0) {
    		return "0";
    	}else {
    		return "1";
    	}
    }

	/* 删除门店 */
	@RequestMapping("/deleteshop")
	@ResponseBody
    public String updateShopBydelete(Integer sid) {
    	if(shopservice.updateShopBydelete(sid)>0) {
    		return "0";
    	}else {
    		return "1";
    	}
    }
	
	
}
