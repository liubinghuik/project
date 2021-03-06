package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Supplier;
import com.accp.domain.SupplierExample;
import com.accp.mapper.SupplierMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SupplierService {

	@Autowired
	private SupplierMapper supplierMapper;
	
	/**
	 * 查询所有供应商
	 * @param example
	 * @return
	 */
	public PageInfo<Supplier> getAll(Integer currentPage,Integer pageSize,String company,String provincename,String cityname,SupplierExample example){
		PageHelper.startPage(currentPage, pageSize);
		List<Supplier> list = this.supplierMapper.selectByExample(company,provincename,cityname,null);
		PageInfo<Supplier> page = new PageInfo<Supplier>(list);
		return page;
	}
	
	/**
	 * 根据id查询供应商
	 * @param suid
	 * @return
	 */
	public Supplier selectByPrimaryKey(Integer suid) {
		return this.supplierMapper.selectByPrimaryKey(suid);
	}
	
	/**
	 * 根据id修改供应商信息
	 * @param record
	 * @return
	 */
	public int updateByPrimaryKeySelective(Supplier record) {
		return this.supplierMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 *新增供应商
	 * @param record
	 * @return
	 */
	public int insertSelective(Supplier record) {
		return this.supplierMapper.insertSelective(record);
	}
	
	/**
	 * 根据id删除供应商
	 * @param suid
	 * @return
	 */
	public int deleteByPrimaryKey(Integer suid) {
		return this.supplierMapper.deleteByPrimaryKey(suid);
	}
}
