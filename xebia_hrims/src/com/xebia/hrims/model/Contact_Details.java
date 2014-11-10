package com.xebia.hrims.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact_details")
public class Contact_Details {

	// id per_add cur_add countary state city pincode contact_no emergy_no
	// work_Email Per_Email skypeId

	@Id
	@Column(name = "emp_id", nullable = false, length = 6)
	private String id;

	@Column(name = "personal_address", nullable = false, length = 20)
	private String personalAddress;

	@Column(name = "current_address", nullable = false, length = 20)
	private String currentAddress;

	@Column(name = "state", nullable = false, length = 20)
	private String state;

	@Column(name = "city", nullable = false, length = 20)
	private String city;

	@Column(name = "personal_pincode", nullable = false, length = 20)
	private String personalpincode;

	@Column(name = "current_pincode", nullable = false, length = 20)
	private String currentpincode;

	@Column(name = "contact_no", nullable = false, length = 20)
	private String contactNo;

	@Column(name = "emergency_contact_no", nullable = false, length = 20)
	private String emergencyContactNo;

	@Column(name = "official_email_id", nullable = false, length = 20)
	private String officialEmailId;

	@Column(name = "personal_email_id", nullable = false, length = 20)
	private String personalEmailId;

	@Column(name = "skype_id", nullable = false, length = 20)
	private String skypeId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPersonalAddress() {
		return personalAddress;
	}

	public void setPersonalAddress(String personalAddress) {
		this.personalAddress = personalAddress;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmergencyContactNo() {
		return emergencyContactNo;
	}

	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}

	public String getOfficialEmailId() {
		return officialEmailId;
	}

	public void setOfficialEmailId(String officialEmailId) {
		this.officialEmailId = officialEmailId;
	}

	public String getPersonalEmailId() {
		return personalEmailId;
	}

	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}

	public String getSkypeId() {
		return skypeId;
	}

	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

	public String getPersonalpincode() {
		return personalpincode;
	}

	public void setPersonalpincode(String personalpincode) {
		this.personalpincode = personalpincode;
	}

	public String getCurrentpincode() {
		return currentpincode;
	}

	public void setCurrentpincode(String currentpincode) {
		this.currentpincode = currentpincode;
	}

}
