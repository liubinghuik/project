package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Supplier;
import com.accp.domain.SupplierExample;
import com.accp.service.SupplierService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/rest/supplier")
public class SupplierController {

	@Autowired
	public SupplierService supplierService;
	
	/**
	 * 查询所有供应商
	 * @param example
	 * @return
	 */
	@RequestMapping("getAll")
	@ResponseBody
	public PageInfo<Supplier> getAll(Integer currentPage,Integer pageSize,String company,String provincename,String cityname,SupplierExample example){
		return this.supplierService.getAll(currentPage,pageSize,company,provincename,cityname,null);
	}
	
	/**
	 * 根据id查询供应商
	 * @param suid
	 * @return
	 */
	@RequestMapping("findSupplierById")
	@ResponseBody
	public Supplier findSupplierById(Integer suid) {
		return this.supplierService.selectByPrimaryKey(suid);
	}
}
