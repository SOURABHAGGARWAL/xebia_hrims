package com.xebia.hrims.business.leaves;

import java.util.List;

import com.xebia.hrims.model.leave.Balance;
import com.xebia.hrims.model.leave.Leave;

public interface ILeavesBusiness {

	public List<Leave> leavesType();

	public List<String> employeeLeaves();

	public void employeeLeaveInfo(String leaveInfo);

	public List<Balance> employeeLeaveInfo();

}
