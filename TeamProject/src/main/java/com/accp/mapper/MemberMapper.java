package com.accp.mapper;

import com.accp.domain.Member;
import com.accp.domain.MemberExample;
import com.accp.domain.Memberclass;
import com.accp.domain.Recharge;
import com.accp.domain.Rechargededuction;
import com.accp.domain.Record;
import com.accp.service.MemberService;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
	//查询等级
	List<Memberclass> selectMemberClass();
	Memberclass selectMemberLevel(int id);
	List<Member> selectAllMember(String mname);
	//添加等级
	int insertClass(Memberclass mb);
	//修改等级
	int updateClass(Memberclass mb);
	//软删除等级
	int deleteClass1(Integer id);
	//硬删除等级
	int deleteClass2(Integer id);
	//恢复删除的会员等级
	int updateHuiFu(Integer id);
	//新增会员
	int insertMember(Member m);
	//查询指定会员信息
	Member selectMember(Integer id);
	//编辑会员
	int updateMember(Member m);
	//按编号查询会员
	Member selectMemberById(int id);
	//查询积分设置是否关闭
	int selectDeduction();
	//设置积分是否可用
	int updateDeduction(int wtd);
	//设置多少积分可抵一元
	int updateDeductionJF(int Jf);
	//查询现有的积分
	int selectDeductionJf();
	//将金额充值到会员表余额
	int updateMoney(Member r);
	//将充值记录录入到充值表
	int insertRecharge(Recharge c);
	//查询交易记录
	List<Record> selectRecord();
	//条件查询交易记录
	List<Record> selectRecordByIdAndDatetime(String a);
	//添加冲抵记录
	int insertRechargededuction(Rechargededuction r);
	//冲抵成功后清空会员积分
	int updateMemberJf(int id);
	//查新所有冲抵记录
	List<Rechargededuction> selectRechargededuction();
	//按条件查询冲抵记录
	List<Rechargededuction> selectRechargedeductionBytime(String a);
	//积分情况
	Integer selectJf();
	//查询某个会员是否存在
	Integer selectByNameCount(String name);
	
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

}