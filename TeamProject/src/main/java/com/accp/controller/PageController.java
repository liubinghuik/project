package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/account")
	public String account() {
		return "account";
	}
	
	@RequestMapping("/storeList")
	public String storeList() {
		return "storeList";
	}
	
	@RequestMapping("/scopePosition")
	public String scopePosition() {
		return "scopePosition";
	}
	
	@RequestMapping("/staffManage")
	public String staffManage() {
		return "staffManage";
	}
	
	@RequestMapping("/shopType")
	public String shopType() {
		return "shopType";
	}
	
	@RequestMapping("/shopManage")
	public String shopManage() {
		return "shopManage";
	}
	
	@RequestMapping("/shopUpload")
	public String shopUpload() {
		return "shopUpload";
	}
	
	@RequestMapping("/supplier")
	public String supplier() {
		return "supplier";
	}
	
	@RequestMapping("/purchase")
	public String purchase() {
		return "purchase";
	}
	
	@RequestMapping("/reception")
	public String reception() {
		return "reception";
	}
	
	@RequestMapping("/memberinformation")
	public String memberinformation() {
		return "memberinformation";
	}
	
	@RequestMapping("/memberLevelset")
	public String memberLevelset() {
		return "memberLevelset";
	}
	
	@RequestMapping("/memberIntegralset")
	public String memberIntegralset() {
		return "memberIntegralset";
	}
	
	@RequestMapping("/membermatch")
	public String membermatch() {
		return "membermatch";
	}
	
	@RequestMapping("/memberrecordoftransaction")
	public String memberrecordoftransaction() {
		return "memberrecordoftransaction";
	}
	
	@RequestMapping("/addPuchase")
	public String addPuchase() {
		return "addPuchase";
	}
}
