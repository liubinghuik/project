package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("getAll")
	@ResponseBody
	public PageInfo<Supplier> getAll(Integer currentPage,Integer pageSize,String company,String provincename,String cityname,SupplierExample example){
		return this.supplierService.getAll(currentPage,pageSize,company,provincename,cityname,null);
	}
	
	/**
	 * 根据id查询供应商
	 * @param suid
	 * @return
	 */
	@GetMapping("findSupplierById")
	@ResponseBody
	public Supplier findSupplierById(Integer suid) {
		return this.supplierService.selectByPrimaryKey(suid);
	}
	
	/**
	 * 根据id修改供应商信息
	 * @param record
	 * @return
	 */
	@PostMapping("updateByPrimaryKeySelective")
	@ResponseBody
	public int updateByPrimaryKeySelective(@RequestBody Supplier record) {
		return this.supplierService.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 新增供应商
	 * @param record
	 * @return
	 */
	@PostMapping("insertSelective")
	@ResponseBody
	public int insertSelective(@RequestBody Supplier record) {
		return this.supplierService.insertSelective(record);
	}
	
	/**
	 * 根据id删除供应商
	 * @param suid
	 * @return
	 */
	@PostMapping("deleteByPrimaryKey")
	@ResponseBody
	public int deleteByPrimaryKey(Integer suid) {
		return this.supplierService.deleteByPrimaryKey(suid);
	}
}
