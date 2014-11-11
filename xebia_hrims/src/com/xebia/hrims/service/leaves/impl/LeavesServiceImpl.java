package com.xebia.hrims.service.leaves.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.leaves.ILeavesBusiness;
import com.xebia.hrims.model.leave.Balance;
import com.xebia.hrims.model.leave.Leave;
import com.xebia.hrims.service.leaves.ILeavesService;

@Service("leavesService")
public class LeavesServiceImpl implements ILeavesService {

	@Autowired
	private ILeavesBusiness leavesBusiness;

	@Override
	public List<Leave> getLeavesType() {
		return leavesBusiness.leavesType();
	}

	@Override
	public List<String> getEmployeeLeaves() {
		List<String> employeeLeaves = leavesBusiness.employeeLeaves();
		return employeeLeaves;
	}

	@Override
	public void applyLeave(String leaveInfo) {
		leavesBusiness.employeeLeaveInfo(leaveInfo);
	}

	@Override
	public List<Balance> getLeaveInfo() {
		List<Balance> leaveInfo = null;
		leaveInfo = leavesBusiness.employeeLeaveInfo();
		return leaveInfo;
	}

}
