package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Color;
import com.accp.domain.Commodity;
import com.accp.domain.Commoditydetails;
import com.accp.domain.Commoditysort;
import com.accp.domain.Shopcommodity;
import com.accp.domain.Size;
import com.accp.mapper.ColorMapper;
import com.accp.mapper.CommodityMapper;
import com.accp.mapper.CommoditydetailsMapper;
import com.accp.mapper.CommoditysortMapper;
import com.accp.mapper.ShopcommodityMapper;
import com.accp.mapper.SizeMapper;
import com.accp.vo.commodityVO;

@Service
@Transactional
public class CommodityService {

	@Autowired
	private CommodityMapper commodityMapper;
	
	@Autowired
	private CommoditydetailsMapper commoditydetailsMapper;
	
	@Autowired
	private CommoditysortMapper commoditysortMapper;
	
	@Autowired
	private ColorMapper colorMapper;
	
	@Autowired
	private SizeMapper sizeMapper;
	
	@Autowired
	private ShopcommodityMapper shopcommodityMapper;
	
	/**
     * 选择商品分类
     * @return
     */
	public List<commodityVO> getCaseCommodity(){
    	return this.commodityMapper.getCaseCommodity();
    }
	
	 /**
     * 查询所有商品
     * @param sname
     * @param csname
     * @param cname
     * @return
     */
	public List<commodityVO> getCommodityAll(String sname,String csname,String cname){
		return this.commodityMapper.getCommodityAll("%"+sname+"%","%"+csname+"%","%"+cname+"%");
	}
	
	/**
	 * 根据id查询商品
	 * @param id
	 * @return
	 */
	public commodityVO queryCommodityById(Integer id){
		return this.commodityMapper.queryCommodityById(id);
	}
	
	/**
	 * 查询所有类别
	 * @return
	 */
	public List<commodityVO> getCommoditysortAll(){
		return this.commodityMapper.getCommoditysortAll();
	}
	
	  /**
     * 查询所有店铺
     * @return
     */
    public List<commodityVO> getShoptAll(){
    	return this.commodityMapper.getShoptAll();
    }
    
    /**
	 * 根据id删除商品
	 * @param id
	 * @return
	 */
    public int deleteCommodity(Integer id){
    	int i = 0;
    	i = this.commodityMapper.deleteByPrimaryKey(id);
    	if(i > 0) {
    		this.commoditydetailsMapper.deleteByPrimaryKey(id);
    	}
		return i;
	}
    
    /**
     * 查询所有类别
     * @return
     */
    public List<Commoditysort> selectCommoditysort(){
    	return this.commoditysortMapper.selectByExample(null);
    }
    
    /**
     * 根据颜色色系查询
     * @return
     */
    public Color queryColorByName(String name){
    	return this.colorMapper.queryColorByName(name);
    }
    
    /**
     * 查询所有尺码
     * @param name
     * @return
     */
    public List<Size> getSizeAll(){
    	return this.sizeMapper.selectByExample(null);
    }
    
    /**
     * 根据尺码查询
     * @return
     */
    public Size querySizeByName(String name){
    	return this.sizeMapper.querySizeByName(name);
    }
    
    /**
     * 新增颜色
     * @param a
     * @return
     */
    public int insertColor(Color a) {
		return this.colorMapper.insert(a);
	}
    
    /**
     * 新增尺码
     * @param a
     * @return
     */
    public int insertSize(Size a) {
		return this.sizeMapper.insert(a);
	}
    
    /**
     * 新增商品
     * @param a
     * @return
     */
    public int insertCommodity(Commodity a) {
		return this.commodityMapper.insert(a);
	}
    
    /**
     * 新增详表
     * @param a
     * @return
     */
//    public int insertCommodityDetails(List<Commoditydetails> a) {
//		return this.commoditydetailsMapper.insertCommodityDetails(a);
//	}
    
    /**
     * 新增详表
     * @param a
     * @return
     */
    public int insertCommodityDetails(Commoditydetails a) {
		return this.commoditydetailsMapper.insert(a);
	}
    
    /**
     * 新增店铺商品表
     * @param a
     * @return
     */
    public int insetShopCommodityMapper(Shopcommodity a) {
    	return this.shopcommodityMapper.insert(a);
    }
}
