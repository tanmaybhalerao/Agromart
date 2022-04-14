package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="farmers")
public class Farmer
{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int farmer_id;

	@Column
	String fname;
	@Column
	String lname;
	@Column
	String address;
	@Column
	String pincode;
	@Column
	String adharcard;	
	
	@Column
	String contactnumber;
	@Column
	private String recoveryAns;
	
	@OneToOne
	@JoinColumn(name="question_id")
	private RecoveryQuestion rqid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="loginid")
	private Login loginid;
	

	public Farmer()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Farmer(String fname, String lname,String address, String adharcard, String pincode, String contactNumber,String recoveryAns, RecoveryQuestion rqid, Login loginid) 
	{
		super();
		this.fname = fname;
		this.lname = lname;
		this.address=address;
		this.adharcard = adharcard;
		this.pincode = pincode;
		this.contactnumber = contactNumber;
		this.recoveryAns = recoveryAns;
		this.rqid = rqid;
		this.loginid = loginid;
	}




	public Farmer(int farmer_id, String fname, String lname, String address, String pincode, String adharcard,
			String contactnumber, String recoveryAns, RecoveryQuestion rqid, Login loginid) {
		super();
		this.farmer_id = farmer_id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.pincode = pincode;
		this.adharcard = adharcard;
		this.contactnumber = contactnumber;
		this.recoveryAns = recoveryAns;
		this.rqid = rqid;
		this.loginid = loginid;
	}

	

	public int getFarmer_id() {
		return farmer_id;
	}


	public void setFarmer_id(int farmer_id) {
		this.farmer_id = farmer_id;
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


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
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


	@Override
	public String toString() {
		return "Farmer [farmer_id=" + farmer_id + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ ", pincode=" + pincode + ", adharcard=" + adharcard + ", contactnumber=" + contactnumber
				+ ", recoveryAns=" + recoveryAns + ", rqid=" + rqid + ", loginid=" + loginid + "]";
	}
	
}