package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Commoditysort;
import com.accp.domain.CommoditysortExample;
import com.accp.service.CommoditysortService;
import com.alibaba.fastjson.JSON;

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
	
	/**
	 * 根据id修改商品类别
	 * @param csid
	 * @return
	 */
	@PostMapping("updateByPrimaryKeySelective")
	@ResponseBody
	public int updateByPrimaryKeySelective(@RequestBody Commoditysort record) {	
		return this.commoditysortService.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 新增商品类别
	 * @param record
	 * @return
	 */
	@PostMapping("insertSelective")
	@ResponseBody
	public int insertSelective(@RequestBody Commoditysort record) {
		System.out.println("数据:"+JSON.toJSONString(record));
		return this.commoditysortService.insertSelective(record);
	}
	
	/**
	 * 根据id删除商品类别
	 * @param csid
	 * @return
	 */
	@PostMapping("deleteByPrimaryKey")
	@ResponseBody
	public int deleteByPrimaryKey(Integer csid) {
		return this.commoditysortService.deleteByPrimaryKey(csid);
	}
}
