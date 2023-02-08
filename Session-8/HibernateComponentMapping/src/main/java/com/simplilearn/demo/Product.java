package com.simplilearn.demo;

import java.math.BigDecimal;

public class Product {
	
	private long id;
	private String name;
	private BigDecimal price;
	
	private ProductParts parts;
	
	public  Product() {
		
	}

	public Product(String name, BigDecimal price, ProductParts parts) {
		super();
		this.name = name;
		this.price = price;
		this.parts = parts;
	}

	 

	 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public ProductParts getParts() {
		return parts;
	}

	public void setParts(ProductParts parts) {
		this.parts = parts;
	}
	
	
	
	

}
