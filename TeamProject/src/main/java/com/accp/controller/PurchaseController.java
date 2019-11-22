package com.accp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.service.PurchaseService;
import com.accp.vo.PurchaseVO;

@Controller
@RequestMapping("/rest/purchase")
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService;
	
	/**
	 * 查询所有采购单
	 * @return
	 */
	@GetMapping("getAll/{startDate}/{endDate}/{suname}")
	@ResponseBody
	public List<PurchaseVO> getAll(@PathVariable String startDate, @PathVariable String endDate, @PathVariable String suname){
		return this.purchaseService.getAll(startDate,endDate,suname);
	}
	
	/**
	 * 根据日期查询出最大的单号
	 * @param date
	 * @return
	 */
	@GetMapping("getMaxOdd/{date}")
	@ResponseBody
	public Map<String,String> getMaxOdd(@PathVariable String date){
		Map<String,String> map = new HashMap<String, String>();
		map.put("odd", this.purchaseService.getMaxOdd(date));
		return map;
	}
	
	/**
	 * 查询所有供应商
	 * @return
	 */
	@GetMapping("getSupplierAll")
	@ResponseBody
	public List<PurchaseVO> getSupplierAll(){
		return this.purchaseService.getSupplierAll();
	}
	
	/**
	 * 根据单号查询供应商下面的商品信息
	 * @return
	 */
	@GetMapping("getSupplierByOdd/{odd}")
	@ResponseBody
	public List<PurchaseVO> getSupplierByOdd(@PathVariable String odd){
		return this.purchaseService.getSupplierByOdd(odd);
	}
}
