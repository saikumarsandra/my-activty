package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="authorities")
public class Authorities {
	

	@Column
	private String userName;
	
	@Column(name="authority")
	private String user;
	
	
	
	public Authorities() {}



	public Authorities(String userName, String user) {
	
		this.userName = userName;
		this.user = user;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Autherities [userName=" + userName + ", user=" + user + "]";
	}
	


}
