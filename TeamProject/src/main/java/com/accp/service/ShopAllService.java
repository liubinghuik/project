package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.ShopAll;
import com.accp.mapper.ShopAllMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional
public class ShopAllService {
	@Autowired
	ShopAllMapper shopallmapper;
	
	//根据登录的账号查询对应的店铺信息
	public	List<ShopAll> selectshopByuaccount(String account){
		return shopallmapper.selectshopByuaccount(account);
	}
	//根据登录的账号查询对应的员工信息
	public List<ShopAll> selectStaffByuaccount(ShopAll shopall){
		List<ShopAll> list=shopallmapper.selectStaffByuaccount(shopall);
		return list;
	}
	//根据对应的员工id查询对应的员工信息
	public ShopAll selectStaffBystid(int stid) {
		return shopallmapper.selectStaffBystid(stid);
	}
	//根据职位id查询出权限
	public List<ShopAll> selectpositionBypid(int pid){
		return shopallmapper.selectpositionBypid(pid);
	}
	
	public List<ShopAll> selectShopAllByjobnumber(String account){
		return shopallmapper.selectShopAllByjobnumber(account);
	}
	public List<ShopAll> selectstaffByreception(){
		return shopallmapper.selectstaffByreception();
	}
}
