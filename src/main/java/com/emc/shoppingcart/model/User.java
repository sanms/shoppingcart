package com.emc.shoppingcart.model;

import java.io.Serializable;

public class User implements Serializable{

	private long uId;
	private String userFname;
	private String userLname;
	private String emailId;
	private String passwrd;
	private String addressLine1;
	private String addressLine2;
	private Long phoneNumber;
	//private Roles role;
	private int r_id;
	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	private String gender;
	
	public User(){
		
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public String getUserFname() {
		return userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	public String getUserLname() {
		return userLname;
	}

	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPasswrd() {
		return passwrd;
	}

	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/*public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}*/

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
}
