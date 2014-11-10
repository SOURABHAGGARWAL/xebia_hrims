package com.xebia.hrims.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author pradeep
 *
 */
@Entity
@Table(name = "login")
public class Login implements Serializable {

	private static final long serialVersionUID = -3879168248261387800L;

	@Id
	@Column(name = "userid", nullable = false, length = 40)
	private String userid;

	@Column(name = "password", nullable = false, length = 40)
	private String password;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login() {
	}

}
