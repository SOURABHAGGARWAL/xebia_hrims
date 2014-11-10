package com.xebia.hrims.business.leaves.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.leaves.ILeavesBusiness;
import com.xebia.hrims.dao.LeavesDao;
import com.xebia.hrims.model.Leaves;

@Service("leavesBusiness")
public class LeavesBusinessImpl implements ILeavesBusiness{

	@Autowired
	private LeavesDao leavesdao;
	
	@Override
	public List<Leaves> getLeavesType() {
		return leavesdao.leaveslist();
	}

}
