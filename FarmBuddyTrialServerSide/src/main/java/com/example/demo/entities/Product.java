package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column
	private String pname;
	@Column
	private int quantity;
	@Column
	private double price;
	@Column
	private String description;
	@Column
	private String productimage;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="categoryid")
	private Category categoryid; 
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="farmer_id")
	private Farmer farmerid;
	
	public Product()
	{
		super();
		
	}
	public Product(int pid, String pname, int quantity, double price, String description, String productimage,
			Category categoryid, Farmer farmerid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
		this.productimage = productimage;
		this.categoryid = categoryid;
		this.farmerid = farmerid;
	}
	public Product(String pname, int quantity, double price, String description, String productimage, Category categoryid,
			Farmer farmerid) {
		super();
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
		this.productimage = productimage;
		this.categoryid = categoryid;
		this.farmerid = farmerid; 
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductimage() {
		return productimage;
	}
	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}
	public Category getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Category categoryid) {
		this.categoryid = categoryid;
	}
	public Farmer getFarmerid() {
		return farmerid;
	}
	public void setFarmerid(Farmer farmerid) {
		this.farmerid = farmerid;
	}
	
	
}