package com.xebia.hrims.business.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.login.ILoginBusiness;
import com.xebia.hrims.dao.LoginDao;

@Service("loginBusiness")
public class LoginBusinessImpl implements ILoginBusiness {

	@Autowired
	private LoginDao logindao;

	public LoginBusinessImpl() {
	}

	@Override
	public boolean validateUser(String userid, String password) {
		boolean result = false;

		result = logindao.isValidUserId(userid);

		if (result) {
			return logindao.isValidPassword(userid, password);
		}

		return result;
	}

}
