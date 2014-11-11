package com.xebia.hrims.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xebia.hrims.model.employee.InitLogin;

@Repository("loginDao")
public class LoginDao {

	@Autowired
	private SessionFactory sessionfactory;

	protected Session getCurrentSession() {
		return sessionfactory.getCurrentSession();
	}

	public boolean isValidUser(String userid, String password) {
		boolean result = false;
		Session session = getCurrentSession();
		session.beginTransaction();

		Query query = session.createQuery("from com.xebia.hrims.model.employee.InitLogin where emp_id = ? and password = ?");
		query.setString(0, userid);
		query.setString(1, password);
		if (query.list().size() > 0) {
			result = true;
		}
		session.close();
		return result;
	}
	
	public InitLogin getLogin(String userid) {
		Session session = getCurrentSession();
		session.beginTransaction();

		Query query = session.createQuery("from com.xebia.hrims.model.employee.InitLogin where emp_id = ?");
		query.setString(0, userid);
		
		InitLogin login = (InitLogin) query.list().get(0);
		
		session.close();
		
		return login;
	}


}
