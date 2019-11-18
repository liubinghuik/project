package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Commoditysort;
import com.accp.domain.CommoditysortExample;
import com.accp.mapper.CommoditysortMapper;

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
	public List<Commoditysort> getAll(CommoditysortExample example){
		return this.commoditysortMapper.selectByExample(null);
	}
	
	/**
	 * 根据id查询商品类别
	 * @param csid
	 * @return
	 */
	public Commoditysort findCommoditysortById(Integer csid) {
		return this.commoditysortMapper.selectByPrimaryKey(csid);
	}
}
