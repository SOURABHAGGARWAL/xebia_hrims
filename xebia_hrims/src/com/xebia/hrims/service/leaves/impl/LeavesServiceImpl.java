package com.xebia.hrims.service.leaves.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.leaves.ILeavesBusiness;
import com.xebia.hrims.model.Leaves;
import com.xebia.hrims.service.leaves.ILeavesService;

@Service("leavesService")
public class LeavesServiceImpl implements ILeavesService {

	@Autowired
	private ILeavesBusiness leavesbusiness;

	@Override
	public List<Leaves> getLeavesType() {
		return leavesbusiness.getLeavesType();
	}

}
