package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Color;
import com.accp.domain.ColorExample;
import com.accp.domain.Commodity;
import com.accp.domain.CommodityExample;
import com.accp.domain.Commoditydetails;
import com.accp.domain.CommoditydetailsExample;
import com.accp.domain.Commoditysort;
import com.accp.domain.CommoditysortExample;
import com.accp.domain.Shopcommodity;
import com.accp.domain.Size;
import com.accp.domain.SizeExample;
import com.accp.mapper.ColorMapper;
import com.accp.mapper.CommodityMapper;
import com.accp.mapper.CommoditydetailsMapper;
import com.accp.mapper.CommoditysortMapper;
import com.accp.mapper.ShopcommodityMapper;
import com.accp.mapper.SizeMapper;
import com.accp.service.CommodityService;
import com.accp.vo.commodityVO;


@Controller
@RequestMapping("/rest/file")
public class FileController {

	@Autowired
	private CommodityService commodityService;
	
	@Autowired
	private CommoditysortMapper commoditysortMapper;
	
	@Autowired
	private ColorMapper colorMapper;
	
	@Autowired
	private SizeMapper sizeMapper;
	
	@Autowired
	private CommodityMapper commodityMapper;
	
	@Autowired
	private CommoditydetailsMapper commoditydetailsMapper;

	@Autowired
	private ShopcommodityMapper shopcommodityMapper;
	
	/**
	 * 商品上传
	 * @param files
	 * @return
	 */
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile [] files) {
		File directory = new File("C:/Users/LiuBingHui/git/project/TeamProject/src/main/resources/static/imgs/");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files) {
				String url = "C:/Users/LiuBingHui/git/project/TeamProject/src/main/resources/static/imgs/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * 导出商品
	 * @param sname
	 * @param csname
	 * @param cname
	 * @return
	 */
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(String sname,String csname,String cname){
		if(sname.equals("全部店铺")) {
			sname = "";
		}
		if(csname.equals("全部类别")) {
			csname = "";
		}
		List<commodityVO> list=commodityService.getCommodityAll(sname, csname, cname);
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();		
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("序号");
		titleRow.createCell(1).setCellValue("类别");
		titleRow.createCell(2).setCellValue("品名");
		titleRow.createCell(3).setCellValue("货号/条码");
		titleRow.createCell(4).setCellValue("规格");
		titleRow.createCell(5).setCellValue("库存");
		titleRow.createCell(6).setCellValue("销售价");
		titleRow.createCell(7).setCellValue("成本价");
		titleRow.createCell(8).setCellValue("网店同步");
		for(int i=0;i<list.size();i++) {
			
			Row row = sheet.createRow(i+1);
			Cell cidCell = row.createCell(0);
			cidCell.setCellValue(list.get(i).getCid());
			Cell csnameCell = row.createCell(1);
			csnameCell.setCellValue(list.get(i).getCsname());
			Cell cnameCell = row.createCell(2);
			cnameCell.setCellValue(list.get(i).getCname());
			Cell broCell = row.createCell(3);
			broCell.setCellValue(list.get(i).getArticleno() + "/" + list.get(i).getShapecode());
			Cell spCell = row.createCell(4);
			spCell.setCellValue(list.get(i).getColorname() + "/" +  list.get(i).getSizename());
			Cell inCell = row.createCell(5);
 			inCell.setCellValue(list.get(i).getInventory());
			Cell sellCell = row.createCell(6);
			sellCell.setCellValue(list.get(i).getSell());
			Cell costCell = row.createCell(7);
			costCell.setCellValue(list.get(i).getCost());
			Cell messageCell = row.createCell(8);
			messageCell.setCellValue(list.get(i).getMessage());
		}
		HttpHeaders headers = new HttpHeaders();
		ByteArrayOutputStream bot = new ByteArrayOutputStream();
		try {
			wb.write(bot);
			headers.setContentDispositionFormData("attachment", new String("导出的信息.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	}
	
	/**
	 * 下载范本
	 * @return
	 */
	@RequestMapping("/download")
	@ResponseBody
	public ResponseEntity<byte []> download(){
		try {
			FileInputStream is = new FileInputStream("C:/Users/LiuBingHui/git/project/TeamProject/src/main/resources/static/model/导入的信息.xlsx");
			byte[] bytes = new byte[is.available()];
			is.read(bytes);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentDispositionFormData("attachment", new String("商品模板.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 导入商品
	 * @param file
	 * @return
	 */
	@RequestMapping("/excelUpload")
	@ResponseBody
	public int excelUpload(MultipartFile file) {
		int in=0;
		try {
			//将传入的文件转换成excel
			Workbook wb = new XSSFWorkbook(file.getInputStream());
			//获取sheet业的个数
			int sheets = wb.getNumberOfSheets();
			for(int i = 0;i < sheets;i++) {
				//根据下标获取sheet页
				Sheet sheet = wb.getSheetAt(i);
				//获取当前sheet页的行数
				int rows = sheet.getPhysicalNumberOfRows();
				//要新增的商品
				Commodity goods = new Commodity();
				//新增的商品编号
				List<Integer> gids = new ArrayList<Integer>();
				for(int j = 1;j < rows;j++) {
					//根据下标获取行
					Row row = sheet.getRow(j);
					
					Cell articlenoCell = row.getCell(0);			//货号
					Cell shapecodeCell = row.getCell(1);			//条形码
					Cell cnameCell = row.getCell(2);				//品名
					Cell csnameCell = row.getCell(3);				//类别
					Cell brandCell = row.getCell(4);				//品牌
					Cell sellCell = row.getCell(5);					//销售价
					Cell costCell = row.getCell(6);					//成本价
					Cell colornameCell = row.getCell(7);			//颜色
					Cell sizenameCell = row.getCell(8);				//尺码
					Cell inventoryCell = row.getCell(9);			//库存
					//获取值
					String articleno = articlenoCell.getStringCellValue().toString().trim();
					String shapecode = shapecodeCell.getStringCellValue().toString().trim();
					String cname = cnameCell.getStringCellValue().toString().trim();
					String csname = csnameCell.getStringCellValue().toString().trim();
					String brand = brandCell.getStringCellValue().toString().trim();
					Float sell = (float) sellCell.getNumericCellValue();
					Float cost = (float) costCell.getNumericCellValue();
					String colorname = colornameCell.getStringCellValue().toString().trim();
					String sizename = sizenameCell.getStringCellValue().toString().trim();		
					Integer inventory = (int) inventoryCell.getNumericCellValue();
					//需要的值
					Integer csid = null;
					Integer colorid = null;
					Integer sizeid = null;

					//查询或新增类别
					Commoditysort classification=new Commoditysort();
					CommoditysortExample classificationExample=new CommoditysortExample();
					classificationExample.createCriteria().andCsnameEqualTo(csname);
					List<Commoditysort> classifications=commoditysortMapper.selectByExample(classificationExample);
					if(classifications==null||classifications.size()<=0) {
						classification.setCsname(csname);
						commoditysortMapper.insertSelective(classification);
					}else {
						classification=classifications.get(0);
					}
					csid=classification.getCsid();
					
					//查询或新增颜色
					Color classification2=new Color();
					ColorExample classificationExample2=new ColorExample();
					classificationExample2.createCriteria().andColornameEqualTo(colorname);
					List<Color> classifications2=colorMapper.selectByExample(classificationExample2);
					if(classifications2==null||classifications2.size()<=0) {
						classification2.setColorname(colorname);
						classification2.setFatherid(0);
						colorMapper.insertSelective(classification2);
					}else {
						classification2=classifications2.get(0);
					}
					colorid=classification2.getColorid();
					
					//查询或新增尺码
					Size classification3=new Size();
					SizeExample classificationExample3=new SizeExample();
					classificationExample3.createCriteria().andSizenameEqualTo(sizename);
					List<Size> classifications3=sizeMapper.selectByExample(classificationExample3);
					if(classifications3==null||classifications3.size()<=0) {
						classification3.setSizename(sizename);
						sizeMapper.insertSelective(classification3);
					}else {
						classification3=classifications3.get(0);
					}
					sizeid=classification3.getSizeid();

					//当第一次运行到这时设置商品实体
					if(goods.getArticleno()==null) {
						goods.setArticleno(articleno);
						goods.setBrand(brand);
						goods.setCsid(csid);
						goods.setCost(cost);
						goods.setSell(sell);
						goods.setCname(cname);
					}
					//当货号一致时设置详情并新增商品，保存商品编号
					if(goods.getArticleno().equals(articleno)) {
						saveGoods(goods, gids, shapecode, inventory, colorid, sizeid);
					}
					//当货号不一致时，重置商品
					else {
						goods=new Commodity();
						goods.setArticleno(articleno);
						goods.setBrand(brand);
						goods.setCsid(csid);
						goods.setCost(cost);
						goods.setSell(sell);
						goods.setCname(cname);
						saveGoods(goods, gids, shapecode, inventory, colorid, sizeid);
					}
				}				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return in;
	}
	
	/**
	 * 新增商品
	 * @param goods
	 * @param gids
	 * @param barcode
	 * @param count
	 * @param colorid
	 * @param sizeid
	 */
	private void saveGoods(Commodity goods, List<Integer> gids, String barcode, Integer count, Integer colorid, Integer sizeid) {
		CommodityExample goodsExample=new CommodityExample();
		goodsExample.createCriteria().andArticlenoEqualTo(goods.getArticleno());
		//根据货号查询信息，若没有则新增
		if(commodityMapper.selectByExample(goodsExample).size()==0) {
			commodityMapper.insertSelective(goods);
			gids.add(goods.getCid());
		}
		if(goods.getCid() != null) {
			Commoditydetails goodsinstance=new Commoditydetails();	
			goodsinstance.setShapecode(barcode);
			goodsinstance.setInventory(count);
			goodsinstance.setCid(goods.getCid());
			goodsinstance.setColorid(colorid);
			goodsinstance.setSizeid(sizeid);
			
			Shopcommodity shopcommodity = new Shopcommodity();
			shopcommodity.setSid(1);
			shopcommodity.setCid(goods.getCid());
			//根据条形码查询信息，若没有则新增
			CommoditydetailsExample goodsinstanceExample = new CommoditydetailsExample();
			goodsinstanceExample.createCriteria().andShapecodeEqualTo(goodsinstance.getShapecode());
			if(commoditydetailsMapper.selectByExample(goodsinstanceExample).size()==0) {
				commoditydetailsMapper.insertSelective(goodsinstance);
				shopcommodityMapper.insertSelective(shopcommodity);
			}
		}
	}
}
