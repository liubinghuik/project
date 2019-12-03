package com.accp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.CommodityAll;
import com.accp.domain.MemberAll;
import com.accp.domain.Rddetails;
import com.accp.service.CommodityAllService;
import com.accp.service.MemberAllService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("/memberall")
public class MemberAllController {
	@Autowired
	MemberAllService MemberAllService;
	@Autowired
	CommodityAllService commodityallservice;
	
	@RequestMapping("/toselectmember")
	@ResponseBody
	public PageInfo<MemberAll> selectmember(int pageNum){
		return MemberAllService.selectmember(pageNum);
	}
	@RequestMapping("/toupdate")
	@ResponseBody
	public String updaterecord(String ddh){
		System.out.println(ddh);
		if(MemberAllService.updaterecord(ddh)>0) {
			return "0";
		}else {
			return "1";
		}
	}
	//新增成交记录
	@RequestMapping("/toinsertcjjl")
	@ResponseBody
	public String insertrecord(@RequestBody MemberAll obj) {
		System.out.println(obj.getRstate());
		/* 随机数 */
		  String val = "";
		  Random random = new Random();
		  for (int i = 0; i < 17; i++){
			   val += String.valueOf(random.nextInt(10));
		  }
		 boolean f=false;
		 System.out.println(val);
		//新增主表
		 MemberAll mm=new MemberAll(val,obj.getClient(),obj.getTotal(),obj.getDiscount(),obj.getActualincome(),obj.getNotincome(),obj.getRdpay(),obj.getSid(),obj.getCashier(),obj.getShopassistant(),obj.getRstate());
		 System.out.println("主:"+JSON.toJSONString(mm));
		 if(MemberAllService.insertrecord(mm)>0) {
			/*如果有会员*/
			 if(obj.getClient()!=0) { 
				  float ye=0;
				  MemberAll vv=new MemberAll(obj.getClient(),obj.getTotal(),ye,obj.getTotal());
				  System.out.println("会员:"+JSON.toJSONString(vv));
				  //修改会员积分和余额
				  if(MemberAllService.updatememberjf(vv)>0) {
					//循环遍历obj
					 for(Rddetails s:obj.getTabledata()) { 
						//新增详表
						 MemberAll zz=new MemberAll(val,s.getCdid(),s.getArticleno(),s.getDage(),s.getOriginalcost(),s.getDiscount(),s.getTotalprice(),0);
						 System.out.println("祥:"+JSON.toJSONString(zz));
						 if(MemberAllService.insertrddetails(zz)>0) {
							//修改商品库存
							 CommodityAll oo=new CommodityAll(s.getCdid(),s.getDage());
							 System.out.println("商品:"+JSON.toJSONString(oo));
							 if(commodityallservice.updatecommoditydetailskc(oo)>0) {
								f=true;
							 }
						 }
					 };
				  }
			//没有会员直接新增详表
			 }else{
				//循环遍历obj
				 for(Rddetails s:obj.getTabledata()) { 
					//新增详表
					 MemberAll zz=new MemberAll(val,s.getCdid(),s.getArticleno(),s.getDage(),s.getOriginalcost(),s.getDiscount(),s.getTotalprice(),0);
					 System.out.println("祥:"+JSON.toJSONString(zz));
					 if(MemberAllService.insertrddetails(zz)>0) {
						//修改商品库存
						 CommodityAll oo=new CommodityAll(s.getCdid(),s.getDage());
						 System.out.println("商品:"+JSON.toJSONString(oo));
						 if(commodityallservice.updatecommoditydetailskc(oo)>0) {
							f=true;
						 }
					 }
				 };
			 }
		 };
		 System.out.println(val+"新增完结！");
		if(f) {
			return val;
		}else {
			return "1";
		}
		
	}
	
}
