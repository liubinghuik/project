package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.CommodityMapper;
import com.accp.vo.commodityVO;

@Service
@Transactional
public class CommodityService {

	@Autowired
	private CommodityMapper commodityMapper;
	
	/**
     * 选择商品分类
     * @return
     */
	public List<commodityVO> getCaseCommodity(){
    	return this.commodityMapper.getCaseCommodity();
    }
}
