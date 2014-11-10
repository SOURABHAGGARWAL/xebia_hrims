package com.xebia.hrims.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author pradeep
 *
 */
@Entity
@Table(name = "login", uniqueConstraints = { @UniqueConstraint(columnNames = { "userid" }) })
public class Login implements Serializable {

	private static final long serialVersionUID = -3879168248261387800L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "userid", nullable = false, length = 40)
	private String userId;

	@Column(name = "password", nullable = false, length = 40)
	private String password;

	@Column(name = "roleid", nullable = false)
	// @OneToOne(targetEntity=Role.class,mappedBy = "id")
	private int roleId;

	@Column(name = "managerid", nullable = true)
	private String managerId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

}
