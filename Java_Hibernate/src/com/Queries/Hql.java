package com.Queries;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hql")
public class Hql 
{
		@Id //@GeneratedValue(strategy=GenerationType.AUTO)
			private int id;
			
			private String uname;
			private String pwd;
			private String email;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getUname() {
				return uname;
			}
			public void setUname(String uname) {
				this.uname = uname;
			}
			public String getPwd() {
				return pwd;
			}
			public void setPwd(String pwd) {
				this.pwd = pwd;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
		}
