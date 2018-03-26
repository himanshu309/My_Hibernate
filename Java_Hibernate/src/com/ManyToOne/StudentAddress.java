package com.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentAddress")
public class StudentAddress 
{
	@Id @GeneratedValue
	private int std_id;
	private String std_add_details;
	
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_add_details() {
		return std_add_details;
	}
	public void setStd_add_details(String std_add_details) {
		this.std_add_details = std_add_details;
	}

}
