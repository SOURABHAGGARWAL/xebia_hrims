package com.xebia.hrims.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xebia.hrims.model.Leaves;

@Repository("leavesDao")
public class LeavesDao {

	@Autowired
	private SessionFactory sessionfactory;

	protected Session getCurrentSession() {
		return sessionfactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<Leaves> leaveslist() {
		Session session = getCurrentSession();
		session.beginTransaction();
		List<Leaves> leaves = (List<Leaves>) session.createCriteria(
				Leaves.class).list();
		session.close();
		return leaves;

	}

}
