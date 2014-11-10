package com.xebia.hrims.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeleaveinfo")
public class EmloyeeLeaveInformation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "empid")
	private int empId;

	@Column(name = "leaveid")
	private int leaveId;

	@Column(name = "leavetype")
	private String leaveType;

	@Column(name = "startdate")
	private String startDate;

	@Column(name = "startday")
	private String startDay;

	@Column(name = "enddate")
	private String endDate;

	@Column(name = "endday")
	private String endDay;

	@Column(name = "reason")
	private String reason;

	@Column(name = "handoverto")
	private String handoverTo;

	@Column(name = "notifyto")
	private String notifyTo;

	@Column(name = "hrstatus")
	private String hrStatus;

	@Column(name = "managerstatus")
	private String managerStatus;

	public int getId() {
		return id;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getStartDay() {
		return startDay;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getEndDay() {
		return endDay;
	}

	public int getEmpId() {
		return empId;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getReason() {
		return reason;
	}

	public String getHandoverTo() {
		return handoverTo;
	}

	public String getNotifyTo() {
		return notifyTo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setHandoverTo(String handoverTo) {
		this.handoverTo = handoverTo;
	}

	public void setNotifyTo(String notifyTo) {
		this.notifyTo = notifyTo;
	}

	public String getHrStatus() {
		return hrStatus;
	}

	public String getManagerStatus() {
		return managerStatus;
	}

	public void setHrStatus(String hrStatus) {
		this.hrStatus = hrStatus;
	}

	public void setManagerStatus(String managerStatus) {
		this.managerStatus = managerStatus;
	}

}
