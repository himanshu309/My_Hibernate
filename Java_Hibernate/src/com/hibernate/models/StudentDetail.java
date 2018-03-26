package com.hibernate.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="StudentDetail")
public class StudentDetail
{	
	 private String std_mob_no;	 
	 
	 @Id @GeneratedValue(generator="newGenerator")   // Defining PK
	 @GenericGenerator(name="newGenerator" , strategy="foreign" ,parameters= {@Parameter(value="std",name="property")})
	 private int std_id;
	 
	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="std_id")
	 private Student std;
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public String getStd_mob_no() {
		return std_mob_no;
	}
	public void setStd_mob_no(String std_mob_no) {
		this.std_mob_no = std_mob_no;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

}
