package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Modelposition;
import com.accp.domain.Position;
import com.accp.domain.ShopAll;
import com.accp.service.ModelpositionService;
import com.accp.service.PositionService;
import com.accp.service.ShopAllService;

@Controller
@RequestMapping("/position")
public class PositionController {
	@Autowired
	PositionService positionservice;
	@Autowired
	ShopAllService shopallservice;
	@Autowired
	ModelpositionService ModelpositionService;
	
	//查询所有职位
	@RequestMapping("/toselect")
	@ResponseBody
    public List<Position> selectPositionAll(){
    	return positionservice.selectPositionAll();
    }
	//新增职位
	@RequestMapping("/toinsertposition")
	@ResponseBody
	public String insertpositionBypname(@RequestParam String pname,@RequestParam(value = "arr[]") String [] arr) {
		/* 首先新增职位名称 */
		System.out.println(pname);
		boolean f=false;
    	if (positionservice.insertpositionBypname(pname)>0) {
			/* 根据职位名称查询pid */
    		Position position=positionservice.selectpositionBypname(pname);
    		/*根据pid新增职位权限表*/
    		for(String s:arr) {
    			int moid=Integer.parseInt(s);
    			Modelposition mm=new Modelposition(moid,position.getPid());
    			if(ModelpositionService.insertmodelposition(mm)>0) {
    				f=true;
    			}
    		}
		 }
    	if(f) {
    		return "0";
    	}else {
    		return "1";
    	}
		 
    }
	//根据职位id查询出对应所拥有的权限
	@RequestMapping("/topositionselect")
	@ResponseBody
	public List<ShopAll> selectpositionBypid(int pid){
		return shopallservice.selectpositionBypid(pid); 
	}
	//根据职位id查询出它的名称
	@RequestMapping("/toselectpositionByid")
	@ResponseBody
	public Position selecttopositionBypid(int pid) {
    	return positionservice.selectpositionBypid(pid);
    } 
	//修改职位
	@RequestMapping("/toupdateposition")
	@ResponseBody
    public String updatepositionBypid(@RequestParam int pid,@RequestParam String pname,@RequestParam(value = "arr[]") String [] arr) {
		//首先修改名称
		boolean f=false;
		Position po=new Position(pid,pname);
		System.out.println(po);
		if(positionservice.updatepositionBypid(po)>0) {
			/*然后删除职位权限表*/
			if(ModelpositionService.deletemodelposition(pid)>0) {
				/* 再新增职位权限表 */
				for(String s:arr) {
	    			int moid=Integer.parseInt(s);
	    			Modelposition mm=new Modelposition(moid,pid);
	    			if(ModelpositionService.insertmodelposition(mm)>0) {
	    				f=true;
	    			}
	    		}
				/* 也有可能一开始啥权限都没有直接新增*/
			}else {
				for(String s:arr) {
	    			int moid=Integer.parseInt(s);
	    			Modelposition mm=new Modelposition(moid,pid);
	    			if(ModelpositionService.insertmodelposition(mm)>0) {
	    				f=true;
	    			}
	    		}
			}
		}
		if(f) {
			return "0";
		}else {
			return "1";
		}
    }
	//删除职位
	@RequestMapping("/todeleteposition")
	@ResponseBody
    public String deletepositionBypid(String pname) {
		Position position=positionservice.selectpositionBypname(pname);
		/* 先删除职位权限表 */
		if(ModelpositionService.deletemodelposition(position.getPid())>0) {
			//再删职位表
			if(positionservice.deletepositionBypid(position.getPid())>0) {
				  return "0";
			}
		}else{
			return "1";
		}
		return null;
    }
}
