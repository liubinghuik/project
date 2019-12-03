package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Purchase;
import com.accp.domain.Purchasedetails;
import com.accp.mapper.PurchaseMapper;
import com.accp.vo.PurchaseVO;

@Service
@Transactional
public class PurchaseService {

	@Autowired
	private PurchaseMapper purchaseMapper;
	
	/**
	 * 查询所有采购单
	 * @return
	 */
	public List<PurchaseVO> getAll(String startDate, String endDate, String suname){
		return this.purchaseMapper.getAll(startDate,endDate,suname);
	}
	
	/**
	 * 根据日期查询出最大的单号
	 * @param date
	 * @return
	 */
	public String getMaxOdd(String date){
		int count = this.purchaseMapper.getMaxOdd(date);
		String maxNo = date;
		
		if(count <= 9){
			maxNo +=  "00" + (count + 1);
		} else{
			maxNo +=  "0" + (count + 1);
		}
		
		return maxNo;
	}
	
	/**
	 * 查询所有供应商
	 * @return
	 */
	public List<PurchaseVO> getSupplierAll() {
		return this.purchaseMapper.getSupplierAll();
	}
	
	/**
	 * 根据单号查询供应商下面的商品信息
	 * @return
	 */
	public List<PurchaseVO> getSupplierByOdd(String odd){
		return this.purchaseMapper.getSupplierByOdd(odd);
	}
	
	/**
	 * 新建采购单
	 * @param purchase
	 * @return
	 */
	public int insertPurchase(Purchase purchase) {
		int i = 0;
		i = this.purchaseMapper.insertPurchase(purchase);
		List<Purchasedetails> details = purchase.getDetails();
		this.purchaseMapper.insertPurchasedetails(details, purchase.getPuid());
		for (Purchasedetails purchasedetails : details) {
			Integer num = purchasedetails.getAmount();
			Integer cdid = purchasedetails.getCdid();
			this.purchaseMapper.updateInventory(num, cdid);
		}
		return i;		
	}
	
	
	/**
	 * 修改采购单
	 * @param purchase
	 * @return
	 */
	public int updateByPrimaryKeySelective(Purchase purchase) {
		int i = 0;
		i = this.purchaseMapper.updateByPrimaryKeySelective(purchase);
		if(i > 0) {
			int j = this.purchaseMapper.delPurchasedetails(purchase.getPuid());
			if(j > 0) {
				List<Purchasedetails> details = purchase.getDetails();
				this.purchaseMapper.insertPurchasedetails(details, purchase.getPuid());
				for (Purchasedetails purchasedetails : details) {
					Integer num = purchasedetails.getAmount();
					Integer cdid = purchasedetails.getCdid();
					purchaseMapper.updateInventory(num, cdid);
				}
			}	
		}		
		return i;
	}
	
	/**
	 * 删除采购单
	 * @param puid
	 * @return
	 */
	public int deletePurchase(Integer puid) {
		int i = 0;
		i = this.purchaseMapper.deletePurchase(puid);
		if(i > 0) {
			this.purchaseMapper.delPurchasedetails(puid);
		}
		return i;
	}
	
	/**
	 * 修改采购单状态
	 * @param puid
	 * @return
	 */
	public int updateAuditState(String odd) {
		return this.purchaseMapper.updateAuditState(odd);
	}
}
