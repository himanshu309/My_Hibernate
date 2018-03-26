package com.Crud;

import javax.persistence.*;

import javax.persistence.Table;

@Entity
@Table(name="CRUD")
public class BasicCrud 
{
	
		@Id @GeneratedValue
		private int rollno;
		private String name;
		private String password;
		
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	}

