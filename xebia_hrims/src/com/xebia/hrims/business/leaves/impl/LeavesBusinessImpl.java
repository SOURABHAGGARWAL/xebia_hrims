package com.xebia.hrims.business.leaves.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.leaves.ILeavesBusiness;
import com.xebia.hrims.dao.LeavesDao;
import com.xebia.hrims.model.EmloyeeLeaveInformation;
import com.xebia.hrims.model.Leaves;

@Service("leavesBusiness")
public class LeavesBusinessImpl implements ILeavesBusiness {

	@Autowired
	private LeavesDao leavesdao;

	@Override
	public List<Leaves> leavesType() {
		return leavesdao.leaveslist();
	}

	@Override
	public List<String> employeeLeaves() {

		List<String> employeeleave = new ArrayList<String>();
		int id = 1;// Todo get userid through session
		List<Leaves> leaves = leavesdao.leaveslist();
		for (Leaves leave : leaves) {
			String leaveinfo = leave.getId() + "," + leave.getType() + ","
					+ leave.getName() + ","
					+ leavesdao.leavesInfo(id, leave.getId());
			employeeleave.add(leaveinfo);

		}
		return employeeleave;
	}

	@Override
	public void employeeLeaveInfo(String leaveInfo) {

		int id = 1;
		int dayLeft = 0;
		String info[] = leaveInfo.split(",");
		if ((dayLeft = validateDate(info[0], info[1], info[3])) >= 0) {
			if (leavesdao.updateLeave(Integer.parseInt(info[0]), id, dayLeft)) {
				leavesdao.saveLeaveInfo(info);
			}

		}

	}

	public int validateDate(String leaveType, String startDate, String endDate) {
		int result = -1;

		result = validateLeaveType(Integer.parseInt(leaveType), 1);
		return result;

	}

	public int validateLeaveType(int leaveId, int numberOfDays) {
		int result = -1;
		result = leavesdao.getLeaveLeft(1, leaveId, numberOfDays);
		return result;
	}

	@Override
	public List<EmloyeeLeaveInformation> employeeLeaveInfo() {
		List<EmloyeeLeaveInformation> list = leavesdao.getEmployeeLeavesInfo();

		return list;
	}
}
