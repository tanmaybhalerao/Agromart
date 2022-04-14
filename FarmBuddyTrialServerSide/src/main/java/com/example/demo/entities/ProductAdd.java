package com.example.demo.entities;

public class ProductAdd {

	String  pname;
     int quantity;
     double price;
    String  description;
     String productimage;
     int categoryid;
   int farmerid;
public ProductAdd() {
	super();
	// TODO Auto-generated constructor stub
}
public ProductAdd(String pname, int quantity, double price, String description, String productimage, int categoryid,
		int farmerid) {
	super();
	this.pname = pname;
	this.quantity = quantity;
	this.price = price;
	this.description = description;
	this.productimage = productimage;
	this.categoryid = categoryid;
	this.farmerid = farmerid;
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
public int getCategoryid() {
	return categoryid;
}
public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}
public int getFarmerid() {
	return farmerid;
}
public void setFarmerid(int farmerid) {
	this.farmerid = farmerid;
}
   
}
