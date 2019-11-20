package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Commoditysort;
import com.accp.domain.CommoditysortExample;
import com.accp.mapper.CommoditysortMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CommoditysortService {

	@Autowired
	public CommoditysortMapper commoditysortMapper;
	
	/**
	 * 查询所有商品类别
	 * @param example
	 * @return
	 */
	public PageInfo<Commoditysort> getAll(Integer currentPage,Integer pageSize,CommoditysortExample example){
		PageHelper.startPage(currentPage, pageSize);
		List<Commoditysort> list = this.commoditysortMapper.selectByExample(null);
		PageInfo<Commoditysort> page = new PageInfo<Commoditysort>(list);
		return page;
	}
	
	/**
	 * 根据id查询商品类别
	 * @param csid
	 * @return
	 */
	public Commoditysort findCommoditysortById(Integer csid) {
		return this.commoditysortMapper.selectByPrimaryKey(csid);
	}
	
	/**
	 * 根据id修改商品类别
	 * @param csid
	 * @return
	 */
	public int updateByPrimaryKeySelective(Commoditysort record) {
		return this.commoditysortMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 新增商品类别
	 * @param record
	 * @return
	 */
	public int insertSelective(Commoditysort record) {
		return this.commoditysortMapper.insertSelective(record);
	}
	
	/**
	 * 根据id删除商品类别
	 * @param csid
	 * @return
	 */
	public int deleteByPrimaryKey(Integer csid) {
		return this.commoditysortMapper.deleteByPrimaryKey(csid);
	}
}
