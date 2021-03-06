package com.ManyToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StdCertification")
public class StdCertification 
{
	@Id @GeneratedValue
	private int certification_id;
	public int getCertification_id() {
		return certification_id;
	}
	public void setCertification_id(int certification_id) {
		this.certification_id = certification_id;
	}
	public String getCertification_name() {
		return certification_name;
	}
	public void setCertification_name(String certification_name) {
		this.certification_name = certification_name;
	}
	String certification_name;
}
