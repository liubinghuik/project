package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Staff;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class StaffService {
	@Autowired
	StaffMapper staffmapper;
	public Staff selectstaffByjobnumber(String gh) {
		return staffmapper.selectstaffByjobnumber(gh);
	}
	public Staff selectstaffBystid(int stid) {
		return staffmapper.selectstaffBystid(stid);
	}
	public int updateByPrimaryKeySelective(Staff record) {
		return staffmapper.updateByPrimaryKeySelective(record);
	}
	public int insertstaff(Staff staff) {
		return staffmapper.insertstaff(staff);
	}
	public int updatestaff(Staff staff) {
		return staffmapper.updatestaff(staff);
	}
	public int updatestaffdelete(int stid) {
		return staffmapper.updatestaffdelete(stid);
	}
}
