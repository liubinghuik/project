package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Color;
import com.accp.domain.Commodity;
import com.accp.domain.Commoditydetails;
import com.accp.domain.Commoditysort;
import com.accp.domain.Shopcommodity;
import com.accp.domain.Size;
import com.accp.service.CommodityService;
import com.accp.vo.commodityVO;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/rest/commodity")
public class CommodityController {

	@Autowired
	private CommodityService commodityService;
	
	/**
     * 选择商品分类
     * @return
     */
	@GetMapping("getCaseCommodity")
	@ResponseBody
	public List<commodityVO> getCaseCommodity(){
    	return this.commodityService.getCaseCommodity();
    }
	
	 /**
     * 查询所有商品
     * @param sname
     * @param csname
     * @param cname
     * @return
     */
	@GetMapping("/getCommodityAll")
	@ResponseBody
	public PageInfo<commodityVO> getCommodityAll(Integer currentPage,Integer pageSize,
								String sname,String csname,String cname){	
		if(sname.equals("全部店铺")) {
			sname = "";
		}
		if(csname.equals("全部类别")) {
			csname = "";
		}
		
		return this.commodityService.getCommodityAll(currentPage,pageSize,sname, csname, cname);
	}
	
	/**
	 * 根据id查询商品
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryCommodityById")
	@ResponseBody
	public commodityVO queryCommodityById(Integer id){
		return this.commodityService.queryCommodityById(id);
	}
	
	/**
	 * 新增商品
	 * @param str
	 * @return
	 */
	@RequestMapping("/insertCommodity")
	@ResponseBody
	public int insertCommodity(@RequestBody commodityVO str){		
		System.out.println("数据 "+JSON.toJSONString(str));
		int colorid = 0;
		int sizeid = 0;
		int typeid = 0;
		
		Color stu2 = new Color();
		Size stu3 = new Size();
		
		for (Commoditysort item : this.commodityService.selectCommoditysort()) {
			if(item.getCsname().equals(str.getCsname())) {
				typeid=item.getCsid();
			}
		}

		if(this.commodityService.queryColorByName(str.getColorname()) == null) {
			stu2.setColorname(str.getColorname());	
			stu2.setColorid(str.getColorid());
			stu2.setFatherid(0);
			this.commodityService.insertColor(stu2);
			stu2 = commodityService.queryColorByName(str.getColorname());
		}else {
			stu2 = commodityService.queryColorByName(str.getColorname());
		}
		
		if(this.commodityService.querySizeByName(str.getSizename()) == null) {
			stu3.setSizename(str.getSizename());
			this.commodityService.insertSize(stu3);
			stu3 = this.commodityService.querySizeByName(str.getSizename());
		}else {
			stu3 = this.commodityService.querySizeByName(str.getSizename());
		}
		
		sizeid = stu3.getSizeid();
		colorid = stu2.getColorid();
		
		Commodity stu1 = new Commodity(str.getCid(), typeid, str.getCname(), str.getBrand(), str.getArticleno(), str.getSell(), str.getCost(), str.getMessage(), str.getPicture());
		int i = this.commodityService.insertCommodity(stu1);
		Shopcommodity stu5 = new Shopcommodity(1, stu1.getCid());
		Commoditydetails stu4 = new Commoditydetails(stu1.getCid(), str.getShapecode(), sizeid, colorid, str.getInventory());
		if(i > 0) {
			this.commodityService.insertCommodityDetails(stu4);
			this.commodityService.insetShopCommodityMapper(stu5);
		}
		return i;
	}
	
	/**
	 * 查询所有类别
	 * @return
	 */
	@RequestMapping("/getCommoditysortAll")
	@ResponseBody
	public List<commodityVO> getCommoditysortAll(){
		return this.commodityService.getCommoditysortAll();
	}
	
	/**
	 * 查询所有店铺
	 * @return
	 */
	@RequestMapping("/getShoptAll")
	@ResponseBody
	public List<commodityVO> getShoptAll(){
		return this.commodityService.getShoptAll();
	}
	
	/**
	 * 修改/商品上传
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/updategoods")
	public String Update(Integer id,Model model) {
		model.addAttribute("id",id);
		return "shopUpload";
	}
	
	/**
	 * 根据id删除商品
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteCommodity")
	@ResponseBody
	public int deleteCommodity(Integer id){
		return this.commodityService.deleteCommodity(id);
	}	
	
	/**
	 * 查询所有尺码
	 * @return
	 */
	@RequestMapping("/getSizeAll")
	@ResponseBody
	public List<Size> getSizeAll(){
		return this.commodityService.getSizeAll();
	}
}
