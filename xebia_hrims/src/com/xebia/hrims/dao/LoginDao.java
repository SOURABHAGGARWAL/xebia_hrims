package com.xebia.hrims.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("loginDao")
public class LoginDao {

	@Autowired
	private SessionFactory sessionfactory;

	protected Session getCurrentSession() {
		return sessionfactory.getCurrentSession();
	}

	public boolean isValidUserId(String userid) {
		boolean result = false;
		Session session = getCurrentSession();
		session.beginTransaction();

		Query query = session
				.createQuery("from com.xebia.hrims.model.Login where userid = ?");
		query.setString(0, userid);
		if (query.list().size() > 0) {
			result = true;
		}
		session.close();
		return result;
	}

	public boolean isValidPassword(String userid, String password) {
		boolean result = false;
		Session session = getCurrentSession();
		session.beginTransaction();

		Query query = session
				.createQuery("from com.xebia.hrims.model.Login where userid = ? and password = ?");
		query.setString(0, userid);
		query.setString(1, password);
		if (query.list().size() > 0) {
			result = true;
		}
		session.close();
		return result;
	}

}
