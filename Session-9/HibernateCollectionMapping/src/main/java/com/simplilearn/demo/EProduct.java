package com.simplilearn.demo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class EProduct {
	
	
	private long ID;
	private String name;
	private BigDecimal price;
	private Date dateAdded;
	
	private List<Color> colors;
	
	private Set<OS>os;
	
	
	public EProduct() {
		
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
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

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public List<Color> getColors() {
		return colors;
	}

	public void setColors(List<Color> colors) {
		this.colors = colors;
	}

	public Set<OS> getOs() {
		return os;
	}

	public void setOs(Set<OS> os) {
		this.os = os;
	}
	
	
	
	
	 

}
