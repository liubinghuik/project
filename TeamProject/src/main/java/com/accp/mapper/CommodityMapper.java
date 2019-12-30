package com.accp.mapper;

import com.accp.domain.Commodity;
import com.accp.domain.CommodityExample;
import com.accp.domain.Commoditydetails;
import com.accp.vo.commodityVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CommodityMapper {
    int countByExample(CommodityExample example);

    int deleteByExample(CommodityExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    List<Commodity> selectByExample(CommodityExample example);

    Commodity selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByExample(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
    
    int updateCount(Integer cid);
    
    /**
     * 选择商品分类
     * @return
     */
    List<commodityVO> getCaseCommodity();
    
    
    /**
     * 查询所有商品
     * @param sname
     * @param csname
     * @param cname
     * @return
     */
    @Select("SELECT e.`csid`,a.`cid`,a.`cname`,e.`csname`,a.`picture`,a.`articleno`,b.`shapecode`,c.`colorname`,d.`sizename`,b.`inventory`,a.`sell`,a.`cost`,a.`message`\r\n" + 
    		"FROM commodity a \r\n" + 
    		"JOIN commoditydetails b ON a.`cid` = b.`cid` \r\n" + 
    		"JOIN color c ON b.`colorid`=c.`colorid`\r\n" + 
    		"JOIN size d ON b.`sizeid`=d.`sizeid`\r\n" + 
    		"JOIN commoditysort e ON a.`csid` = e.`csid`\r\n" + 
    		"JOIN shopcommodity g ON g.`cid` = a.`cid`\r\n" + 
    		"JOIN shop f ON  g.`sid` = f.`sid`\r\n" + 
    		"WHERE f.`sname` LIKE #{sname} AND e.`csname` like #{csname} AND (a.`cname` LIKE #{cname} OR a.`articleno` LIKE #{cname}) GROUP BY a.`cid`")
    List<commodityVO> getCommodityAll(@Param("sname")String sname, @Param("csname")String csname, @Param("cname")String cname);
    
    /**
     * 根据id查询商品
     * @param sname
     * @param csname
     * @param cname
     * @return
     */
    @Select("SELECT a.`cid`,a.`cname`,a.`brand`,e.`csname`,a.`picture`,a.`articleno`,b.`shapecode`,c.`colorname`,d.`sizename`,b.`inventory`,a.`sell`,a.`cost`,a.`message`\r\n" + 
    		"FROM commodity a \r\n" + 
    		"JOIN commoditydetails b ON a.`cid` = b.`cid` \r\n" + 
    		"JOIN color c ON b.`colorid`=c.`colorid`\r\n" + 
    		"JOIN size d ON b.`sizeid`=d.`sizeid`\r\n" + 
    		"JOIN commoditysort e ON a.`csid` = e.`csid`\r\n" + 
    		"JOIN shopcommodity g ON g.`cid` = a.`cid`\r\n" + 
    		"JOIN shop f ON  g.`sid` = f.`sid`\r\n" + 
    		"WHERE a.`cid` = #{id} GROUP BY a.`cid`")
    commodityVO queryCommodityById(@Param("id")Integer id);
    
    /**
     * 查询所有类别
     * @return
     */
    @Select("SELECT * FROM commoditysort")
    List<commodityVO> getCommoditysortAll();
    
    /**
     * 查询所有店铺
     * @return
     */
    @Select("SELECT * FROM shop where state=0")
    List<commodityVO> getShoptAll();
    
    @Select("SELECT * FROM commodity where cname=#{name}")
    Commodity queryCommodityByName(@Param("name")String name);
    
   
    @Select(" SELECT a.shapecode,b.colorname,c.sizename,a.inventory FROM commoditydetails a\r\n" + 
    		"JOIN color b ON a.`colorid`=b.`colorid`\r\n" + 
    		"JOIN size c ON a.`sizeid`=c.`sizeid`\r\n" + 
    		"WHERE a.cid = #{cid}")
    List<commodityVO> getDetailsAll(@Param("cid")Integer cid);
}