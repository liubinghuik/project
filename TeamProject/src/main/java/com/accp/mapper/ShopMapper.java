package com.accp.mapper;

import com.accp.domain.Shop;
import com.accp.domain.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    int countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

	/* 新增门店 */
    int insertShop(Shop shop);

	/* 根据id查询对应的门店信息 */
    Shop selectShopBysid(int sid);

	/* 修改门店信息 */
    int updateShop(Shop shop);

	/* 删除门店 */
    int updateShopBydelete(int sid);

	/* 查询所有店铺 */
    List<Shop> selectShopAll(String account);
}