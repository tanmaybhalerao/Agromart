package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer 
{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customer_id;
	@Column
	String fname;
	@Column
	String lname;
	
	
	@Column
	String pincode;
	@Column
	String address;
	@Column
	String adharcard;	
	
	@Column
	String contactnumber;
	@Column
	private String recoveryAns;
	
	@OneToOne
	@JoinColumn(name="question_id")
	private RecoveryQuestion rqid;
	
	@OneToOne
	@JoinColumn(name="loginid")
	private Login loginid;;
	
	public Customer()
	{
		super();
	}

	public Customer(String fname, String lname,String address, String adharcard, String pincode, String contactNumber,String recoveryAns, RecoveryQuestion rqid, Login loginid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address=address;
		this.pincode = pincode;
		this.adharcard = adharcard;
		this.contactnumber = contactNumber;
		this.recoveryAns = recoveryAns;
		this.rqid = rqid;
		this.loginid = loginid;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFname() {
		return fname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
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

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getRecoveryAns() {
		return recoveryAns;
	}

	public void setRecoveryAns(String recoveryAns) {
		this.recoveryAns = recoveryAns;
	}

	public RecoveryQuestion getRqid() {
		return rqid;
	}

	public void setRqid(RecoveryQuestion rqid) {
		this.rqid = rqid;
	}

	public Login getLoginid() {
		return loginid;
	}

	public void setLoginid(Login loginid) {
		this.loginid = loginid;
	}

	

}
