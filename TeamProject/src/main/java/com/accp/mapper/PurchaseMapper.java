package com.accp.mapper;

import com.accp.domain.Purchase;
import com.accp.domain.PurchaseExample;
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

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);
    
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
    
    
}