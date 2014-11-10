package com.xebia.hrims.business.leaves;

import java.util.List;

import com.xebia.hrims.model.EmloyeeLeaveInformation;
import com.xebia.hrims.model.Leaves;

public interface ILeavesBusiness {

	public List<Leaves> leavesType();

	public List<String> employeeLeaves();

	public void employeeLeaveInfo(String leaveInfo);

	public List<EmloyeeLeaveInformation> employeeLeaveInfo();

}
