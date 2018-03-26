package com.ManyToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student2")
public class Student2 
{
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<StdCertification> stdcertification=new HashSet<>(0);
	public Set<StdCertification> getStdcertification() {
		return stdcertification;
	}
	public void setStdcertification(Set<StdCertification> stdcertification) {
		this.stdcertification = stdcertification;
	}
	@Id @GeneratedValue 
	private int std_id;
	
	
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
	private String std_name;
	
	
}
