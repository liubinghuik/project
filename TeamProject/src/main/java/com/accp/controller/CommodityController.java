package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.service.CommodityService;
import com.accp.vo.commodityVO;

@Controller
@RequestMapping("/rest/commodity")
public class CommodityController {

	@Autowired
	private CommodityService commodityService;
	
	/**
     * 选择商品分类
     * @return
     */
	@GetMapping("getCaseCommodity")
	@ResponseBody
	public List<commodityVO> getCaseCommodity(){
    	return this.commodityService.getCaseCommodity();
    }
}
