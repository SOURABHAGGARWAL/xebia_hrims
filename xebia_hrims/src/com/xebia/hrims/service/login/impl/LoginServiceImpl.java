package com.xebia.hrims.service.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.hrims.business.login.ILoginBusiness;
import com.xebia.hrims.model.Login;
import com.xebia.hrims.service.login.ILoginService;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private ILoginBusiness loginbusiness;

	public LoginServiceImpl() {

	}

	@Override
	public boolean isValidUser(String userid, String password) {
		boolean result = false;
		//Todo This Need To Be Removed``
		Login login = new Login();
		login.setPassword(password);
		login.setUserid(userid);
		result = loginbusiness.isValidUser(login);

		//Todo Validate UserId And Password Separately
		// if (loginbusiness.isValidUserId(userid)) {
		//
		// if (loginbusiness.isValidPassword(password)) {
		// result = true;
		// }
		// }

		return result;
	}

}
