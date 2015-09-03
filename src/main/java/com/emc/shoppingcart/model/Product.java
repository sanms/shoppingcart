package com.emc.shoppingcart.model;

import java.io.Serializable;

public class Product implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private long pId;
	private String pName;
	private Float price;
	private String category;
	private String imageName;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	
	
}
