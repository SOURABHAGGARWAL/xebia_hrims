package com.xebia.hrims.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xebia.hrims.model.Login;

@Repository("loginDao")
public class LoginDao {

	@Autowired
	private SessionFactory sessionfactory;

	protected Session getCurrentSession() {
		return sessionfactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<Login> listUser() {
		Session session = getCurrentSession();
		session.beginTransaction();
		List<Login> list = (List<Login>) session.createCriteria(Login.class)
				.list();
		session.close();
		return list;

	}

	public boolean isValidUserId(String userid) {
		boolean result = false;
		Session session = getCurrentSession();
		session.beginTransaction();

		Query query = session.createQuery("from com.xebia.hrims.model.Login where userid = ?");
		query.setString(0, userid);
		if(query.list().size()>0){
			result = true;
		}
		session.close();
		return result;
	}
	
	public boolean isValidPassword(String userid, String password) {
		boolean result = false;
		Session session = getCurrentSession();
		session.beginTransaction();

		Query query = session.createQuery("from com.xebia.hrims.model.Login where userid = ? and password = ?");
		query.setString(0, userid);
		query.setString(1, password);
		if(query.list().size()>0){
			result = true;
		}
		session.close();
		return result;
	}

}
