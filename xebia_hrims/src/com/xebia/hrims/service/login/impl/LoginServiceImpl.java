package com.xebia.hrims.service.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.login.ILoginBusiness;
import com.xebia.hrims.model.employee.InitLogin;
import com.xebia.hrims.service.login.ILoginService;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private ILoginBusiness loginbusiness;
	
	@Override
	public boolean isValidUser(String userid, String password) {
		boolean result = false;

		result = loginbusiness.validateUser(userid, password);

		return result;
	}
	
	@Override
	public InitLogin getLogin(String userid) {
		InitLogin login = loginbusiness.getLogin(userid);
		return login;
	}

}
