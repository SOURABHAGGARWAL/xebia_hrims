package com.xebia.hrims.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leaves")
public class EmployeeDetails {
	@Id
	@Column(name = "userid", nullable = false, length = 40)
	private String userid;
	@Column(name = "empfname", nullable = false, length = 40)
	private String empFname;
	@Column(name = "empmname", nullable = false, length = 40)
	private String empMname;
	@Column(name = "emplname", nullable = false, length = 40)
	private String empLname;
	@Column(name = "dob", nullable = false, length = 40)
	private String dob;
	@Column(name = "country", nullable = false, length = 40)
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmpFname() {
		return empFname;
	}

	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}

	public String getEmpMname() {
		return empMname;
	}

	public void setEmpMname(String empMname) {
		this.empMname = empMname;
	}

	public String getEmpLname() {
		return empLname;
	}

	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
}
