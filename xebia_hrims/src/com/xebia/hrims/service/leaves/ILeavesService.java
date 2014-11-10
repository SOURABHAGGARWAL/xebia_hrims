package com.xebia.hrims.service.leaves;

import java.util.List;

import com.xebia.hrims.model.EmloyeeLeaveInformation;
import com.xebia.hrims.model.Leaves;

public interface ILeavesService {

	public List<Leaves> getLeavesType();

	public List<String> getEmployeeLeaves();

	public void applyLeave(String leaveInfo);

	public List<EmloyeeLeaveInformation> getLeaveInfo();

}
