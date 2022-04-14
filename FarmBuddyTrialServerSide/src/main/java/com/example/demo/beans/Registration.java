package com.example.demo.beans;

import com.example.demo.entities.Login;
import com.example.demo.entities.RecoveryQuestion;

public class Registration 
{
	private String fname;

	private String lname;
	
	public String address;
	private String pincode;

	
	private String adharcard;

	private String email;

	private String password;

	private String contactnumber;
	
	private String recoveryQue;
	private String recoveryAns;
	
	public Registration() {
		super();
		
	}

	public Registration(String fname, String lname,String address,  String pincode, String adharcard, String email, String password,
			String contactnumber, String recoveryQue, String recoveryAns) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address=address;
		this.pincode = pincode;
		this.adharcard = adharcard;
		this.email = email;
		this.password = password;
		this.contactnumber = contactnumber;
		this.recoveryQue = recoveryQue;
		this.recoveryAns = recoveryAns;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAdharcard() {
		return adharcard;
	}

	public void setAdharcard(String adharcard) {
		this.adharcard = adharcard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactNumber) {
		this.contactnumber = contactNumber;
	}

	public String getRecoveryQue() {
		return recoveryQue;
	}

	public void setRecoveryQue(String recoveryQue) {
		this.recoveryQue = recoveryQue;
	}

	public String getRecoveryAns() {
		return recoveryAns;
	}

	public void setRecoveryAns(String recoveryAns) {
		this.recoveryAns = recoveryAns;
	}
	

}
