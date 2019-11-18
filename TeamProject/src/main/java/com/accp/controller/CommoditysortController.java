package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Commoditysort;
import com.accp.domain.CommoditysortExample;
import com.accp.service.CommoditysortService;

@Controller
@RequestMapping("/rest")
public class CommoditysortController {

	@Autowired
	public CommoditysortService commoditysortService;
	
	/**
	 * 查询所有商品类别
	 * @param example
	 * @return
	 */
	@GetMapping("getAll")
	@ResponseBody
	public List<Commoditysort> getAll(CommoditysortExample example){
		return this.commoditysortService.getAll(null);
	}
	
	/**
	 * 根据id查询商品类别
	 * @param csid
	 * @return
	 */
	@GetMapping("findCommoditysortById")
	@ResponseBody
	public Commoditysort findCommoditysortById(Integer csid) {
		return this.commoditysortService.findCommoditysortById(csid);
	}
}
