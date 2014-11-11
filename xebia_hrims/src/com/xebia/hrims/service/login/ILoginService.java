package com.xebia.hrims.service.login;

import com.xebia.hrims.model.employee.InitLogin;

public interface ILoginService {

	public boolean isValidUser(String userid, String password);
	
	public InitLogin getLogin(String userid);

}
