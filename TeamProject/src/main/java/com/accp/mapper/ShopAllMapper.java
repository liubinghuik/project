package com.accp.mapper;

import java.util.List;

import com.accp.domain.ShopAll;

public interface ShopAllMapper {
	//根据登录的账号查询对应的店铺信息
	List<ShopAll> selectshopByuaccount(String account);
	//根据登录的账号查询对应的员工信息
	List<ShopAll> selectStaffByuaccount(ShopAll shopall );
	//根据对应的员工id查询对应的员工信息
	ShopAll selectStaffBystid(int stid);
	/* 根据职位id查询出权限 */
	List<ShopAll> selectpositionBypid(int pid);
	
	List<ShopAll> selectShopAllByjobnumber(String account);
	
	List<ShopAll> selectstaffByreception();
}
