package com.xebia.hrims.business.login;

import com.xebia.hrims.model.employee.InitLogin;

public interface ILoginBusiness {

	public boolean validateUser(String userid, String password);
	
	public InitLogin getLogin(String userid);

}
