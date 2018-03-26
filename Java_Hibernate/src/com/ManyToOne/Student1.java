package com.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.Table;;

@Entity
@Table(name="Student1")
public class Student1 
{
	@Id @GeneratedValue
	private int std_id;
	private String std_name;
	
	//Steps for M-1 mapping
	@ManyToOne(cascade=CascadeType.ALL)
	private StudentAddress std_add_id;
		
	
	public StudentAddress getStd_add_id() {
		return std_add_id;
	}
	public void setStd_add_id(StudentAddress std_add_id) {
		this.std_add_id = std_add_id;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	
	
	
}
