package com.accp.mapper;

import com.accp.domain.Memberclass;
import com.accp.domain.MemberclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberclassMapper {
    int countByExample(MemberclassExample example);

    int deleteByExample(MemberclassExample example);

    int deleteByPrimaryKey(Integer mcid);

    int insert(Memberclass record);

    int insertSelective(Memberclass record);

    List<Memberclass> selectByExample(MemberclassExample example);

    Memberclass selectByPrimaryKey(Integer mcid);

    int updateByExampleSelective(@Param("record") Memberclass record, @Param("example") MemberclassExample example);

    int updateByExample(@Param("record") Memberclass record, @Param("example") MemberclassExample example);

    int updateByPrimaryKeySelective(Memberclass record);

    int updateByPrimaryKey(Memberclass record);
}