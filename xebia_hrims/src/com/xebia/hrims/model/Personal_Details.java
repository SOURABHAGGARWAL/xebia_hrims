package com.xebia.hrims.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personal_details")
public class Personal_Details {

	// id fname lname gennder marritial_status dob Place Of Birth mname
	// blood_group

	@Id
	@Column(name = "emp_id", nullable = false, length = 6)
	private String id;

	@Column(name = "fname", nullable = false, length = 20)
	private String fName;

	@Column(name = "mname", nullable = true, length = 20)
	private String mName;

	@Column(name = "lname", nullable = false, length = 20)
	private String lName;

	@Column(name = "gender", nullable = false, length = 10)
	private String gender;

	@Column(name = "dob", nullable = false, length = 20)
	private String dob;

	@Column(name = "place_of_birth", nullable = false, length = 20)
	private String placeOfBirth;

	@Column(name = "blood_group", nullable = false, length = 20)
	private String bloodGroup;

	@Column(name = "country", nullable = false, length = 20)
	private String country;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
