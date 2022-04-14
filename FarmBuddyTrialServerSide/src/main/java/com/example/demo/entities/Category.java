package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="category")
public class Category 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryid;
	@Column
	private String categoryname;
	@Column
	private String description;
	public Category() 
	{
		super();
	}
	public Category(int categoryid) {
		super();
		this.categoryid = categoryid;
	}
	public Category(int categoryid, String categoryname, String description) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.description = description;
	}
	public Category(String categoryname, String description) {
		super();
		this.categoryname = categoryname;
		this.description = description;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}