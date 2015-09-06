package com.emc.shoppingcart.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserLogin {

	private String emailId;
	private String passwrd;

	@NotEmpty @Email
	public String getEmailId() {
		return emailId;
	}
	@NotEmpty
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPasswrd() {
		return passwrd;
	}

	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
}
