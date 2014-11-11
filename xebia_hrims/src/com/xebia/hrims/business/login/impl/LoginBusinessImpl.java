package com.xebia.hrims.business.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.login.ILoginBusiness;
import com.xebia.hrims.dao.LoginDao;
import com.xebia.hrims.model.employee.InitLogin;

@Service("loginBusiness")
public class LoginBusinessImpl implements ILoginBusiness {

	@Autowired
	private LoginDao logindao;

	@Override
	public boolean validateUser(String userid, String password) {
		boolean result = false;
		result = logindao.isValidUser(userid, password);
		return result;
	}
	
	@Override
	public InitLogin getLogin(String userid) {
		InitLogin login = logindao.getLogin(userid);
		return login;
	}

}
