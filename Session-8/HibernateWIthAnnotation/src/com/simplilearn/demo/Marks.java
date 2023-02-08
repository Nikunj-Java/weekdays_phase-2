package com.simplilearn.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //this will create new table inside database
@Table(name="my_marks")
public class Marks {
	
	@Id// create primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid")
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}
	public int getMy_marks() {
		return my_marks;
	}
	public void setMy_marks(int my_marks) {
		this.my_marks = my_marks;
	}
	private String name;
	private int total_marks;
	private int my_marks;
	
	

}
