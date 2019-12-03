package com.accp.mapper;

import com.accp.domain.Purchase;
import com.accp.domain.PurchaseExample;
import com.accp.domain.Purchasedetails;
import com.accp.vo.PurchaseVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseMapper {
    int countByExample(PurchaseExample example);

    int deleteByExample(PurchaseExample example);

    int deleteByPrimaryKey(Integer puid);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    List<Purchase> selectByExample(PurchaseExample example);

    Purchase selectByPrimaryKey(Integer puid);

    int updateByExampleSelective(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByExample(@Param("record") Purchase record, @Param("example") PurchaseExample example);
    
    int updateByPrimaryKey(Purchase record);
    
	/**
	 * 修改采购单
	 * @param purchase
	 * @return
	 */
    int updateByPrimaryKeySelective(Purchase purchase);
    
    /**
     * 查询所有采购单
     * @return
     */
    List<PurchaseVO> getAll(@Param("startDate")String startDate, @Param("endDate")String endDate, @Param("suname")String suname);

    /**
     * 根据日期查询出最大的单号
     * @param date
     * @return
     */
    int getMaxOdd(@Param("date")String date);
    
    /**
	 * 查询所有供应商
	 * @return
	 */
    List<PurchaseVO> getSupplierAll();
    
    /**
	 * 根据单号查询供应商下面的商品信息
	 * @return
	 */
	List<PurchaseVO> getSupplierByOdd(String odd);
	
	/**
	 * 新建采购单--主表
	 * @param purchase
	 * @return
	 */
	int insertPurchase(Purchase purchase);   
	
	/**
	 * 新建采购单--详表
	 * @param list
	 * @param puid
	 * @return
	 */
	int insertPurchasedetails(@Param("details") List<Purchasedetails> details,
								@Param("puid") Integer puid);
	
	/**
	 * 删除采购单详表信息
	 * @param puid
	 * @return
	 */
	int delPurchasedetails(Integer puid);
	
	/**
	 * 修改商品库存数量
	 * @param num
	 * @param cdid
	 * @return
	 */
	int updateInventory(@Param("num")Integer num, @Param("cdid")Integer cdid);
	
	/**
	 * 删除采购单
	 * @param puid
	 * @return
	 */
	int deletePurchase(Integer puid);
	
	/**
	 * 修改采购单状态
	 * @param puid
	 * @return
	 */
	int updateAuditState(String odd);
	
}