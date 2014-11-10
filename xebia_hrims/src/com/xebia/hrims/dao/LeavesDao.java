package com.xebia.hrims.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xebia.hrims.model.EmloyeeLeaveInformation;
import com.xebia.hrims.model.LeaveBalance;
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

	public int leavesInfo(int empid, int leaveid) {
		Session session = getCurrentSession();
		session.beginTransaction();
		Query query = session
				.createQuery("from com.xebia.hrims.model.LeaveBalance where empid = ? and leaveid = ?");
		query.setInteger(0, empid);
		query.setInteger(1, leaveid);
		int leaveleft = ((LeaveBalance) query.list().get(0)).getLeft();
		session.close();
		return leaveleft;
	}

	public boolean updateLeave(int leaveid, int userid, int daysLeft) {
		boolean result = true;

		Session session = getCurrentSession();
		Transaction tx = session.beginTransaction();
		Query query = session
				.createQuery("update com.xebia.hrims.model.LeaveBalance set"
						+ " leavesleft = ?  where empid = ? and leaveid = ?");
		query.setInteger(0, daysLeft);
		query.setInteger(1, userid);
		query.setInteger(2, leaveid);
		query.executeUpdate();
		tx.commit();
		return result;
	}

	public boolean saveLeaveInfo(String[] leaveInfo) {
		boolean result = true;

		System.out.println("length : " + leaveInfo.length);
		for (String s : leaveInfo) {
			System.out.println(s);
		}
		Session session = getCurrentSession();
		Transaction tx = session.beginTransaction();
		EmloyeeLeaveInformation empleaveinfo = new EmloyeeLeaveInformation();
		empleaveinfo.setEmpId(1); // ToDo Get UserId From Session
		empleaveinfo.setLeaveId(Integer.parseInt(leaveInfo[0]));
		empleaveinfo.setStartDate(leaveInfo[1]);
		empleaveinfo.setStartDay(leaveInfo[2]);
		empleaveinfo.setEndDate(leaveInfo[3]);
		empleaveinfo.setEndDay(leaveInfo[4]);
		empleaveinfo.setReason(leaveInfo[5]);
		empleaveinfo.setHandoverTo(leaveInfo[6]);
		empleaveinfo.setNotifyTo(leaveInfo[7]);
		empleaveinfo.setHrStatus("pending");
		empleaveinfo.setManagerStatus("pending");
		session.save(empleaveinfo);
		tx.commit();
		return result;
	}

	public int getLeaveLeft(int id, int leaveId, int numberOfDays) {
		int result = 0;
		result = leavesInfo(id, leaveId);
		return result - numberOfDays;
	}

	public List<EmloyeeLeaveInformation> getEmployeeLeavesInfo() {
		System.out.println("inside getEmployeeLeavesInfo");
		Session session = getCurrentSession();
		session.beginTransaction();
		Query query = session
				.createQuery("from com.xebia.hrims.model.EmloyeeLeaveInformation where empid = ?");
		query.setInteger(0, 1);
		List<EmloyeeLeaveInformation> employeeleavesinfolist = (List<EmloyeeLeaveInformation>) query
				.list();

		for (EmloyeeLeaveInformation emp : employeeleavesinfolist) {
			System.out.println(emp.getLeaveId() + " " + emp.getHandoverTo()
					+ " " + emp.getHrStatus() + " " + emp.getManagerStatus());
		}
		session.close();
		return employeeleavesinfolist;
	}

	public String getLeaveType(int leaveid){
		String leaveType = null;
		Session session = getCurrentSession();
		session.beginTransaction();
		Query query = session
				.createQuery("from com.xebia.hrims.model.Leaves where leaveid = ?");
		query.setInteger(0, leaveid);
		
		leaveType = ((Leaves)query.list().get(0)).getType();
		return leaveType;
	}
}
