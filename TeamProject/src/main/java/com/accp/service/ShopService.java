package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Shop;
import com.accp.mapper.ShopMapper;

@Service
@Transactional
public class ShopService {
	@Autowired
	ShopMapper shopmapper;
	//根据账户查询对应的店铺
	
	/* 新增门店 */
    public int insertShop(Shop shop) {
    	return shopmapper.insertSelective(shop);
    }

	/* 根据id查询对应的门店信息 */
    public Shop selectShopBysid(int sid) {
    	return shopmapper.selectShopBysid(sid);
    }

	/* 修改门店信息 */
    public int updateShop(Shop shop) {
    	return shopmapper.updateByPrimaryKeySelective(shop);
    }

	/* 删除门店 */
    public int updateShopBydelete(int sid) {
    	return shopmapper.updateShopBydelete(sid);
    }
    /* 查询所有店铺 */
   public List<Shop> selectShopAll(String account){
	   return shopmapper.selectShopAll(account);
   }
}
