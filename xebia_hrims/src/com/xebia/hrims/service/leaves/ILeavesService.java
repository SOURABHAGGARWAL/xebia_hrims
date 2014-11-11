package com.xebia.hrims.service.leaves;

import java.util.List;

import com.xebia.hrims.model.leave.Balance;
import com.xebia.hrims.model.leave.Leave;

public interface ILeavesService {

	public List<Leave> getLeavesType();

	public List<String> getEmployeeLeaves();

	public void applyLeave(String leaveInfo);

	public List<Balance> getLeaveInfo();

}
