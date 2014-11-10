package com.xebia.hrims.business.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.login.ILoginBusiness;
import com.xebia.hrims.dao.LoginDao;
import com.xebia.hrims.model.Login;

@Service("loginBusiness")
public class LoginBusinessImpl implements ILoginBusiness {

	@Autowired
	private LoginDao logindao;

	public LoginBusinessImpl() {
	}

	@Override
	public boolean isValidUser(Login loginuser) {
		boolean result = false;
		
		result = logindao.isValidUserId(loginuser.getUserid());
		
		if(result){
			return logindao.isValidPassword(loginuser.getUserid(), loginuser.getPassword());
		}
		
		return result;
	}
	
}
