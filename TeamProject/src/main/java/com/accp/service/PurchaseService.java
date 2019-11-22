package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
