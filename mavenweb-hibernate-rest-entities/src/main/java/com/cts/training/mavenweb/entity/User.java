package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



@Entity // Registers the class as entity

@Table(name = "users")
public class User {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auto Increment
	private Integer id;
	
	@Column(name = "user name")
	private String name;
	
	@Column
	private String password;
	
	@Column
	private  String email;
	
	@Column
	private  String FirstName;
	@Column
	private  String LastName;
	
	@Column
	private LocalDateTime DateOfBirth;
	
	@Column
	private  String ProfilePic;
	
	@Column  @UpdateTimestamp
	private  LocalDateTime UpateOn;
	
	@Column  @CreationTimestamp
	private LocalDateTime CreatedOn;
	
	@Column
	private   boolean Enabled;	
	
	
	
	public User() {}



	public User(Integer id, String name, String password, String email, String firstName, String lastName,
			LocalDateTime dateOfBirth, String profilePic, LocalDateTime upateOn, LocalDateTime createdOn, boolean enabled) {
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		ProfilePic = profilePic;
		UpateOn = upateOn;
		CreatedOn = createdOn;
		Enabled = enabled;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public LocalDateTime getDateOfBirth() {
		return DateOfBirth;
	}



	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}



	public String getProfilePic() {
		return ProfilePic;
	}



	public void setProfilePic(String profilePic) {
		ProfilePic = profilePic;
	}



	public LocalDateTime getUpateOn() {
		return UpateOn;
	}



	public void setUpateOn(LocalDateTime upateOn) {
		UpateOn = upateOn;
	}



	public LocalDateTime getCreatedOn() {
		return CreatedOn;
	}



	public void setCreatedOn(LocalDateTime createdOn) {
		CreatedOn = createdOn;
	}



	public boolean isEnabled() {
		return Enabled;
	}



	public void setEnabled(boolean enabled) {
		Enabled = enabled;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", FirstName="
				+ FirstName + ", LastName=" + LastName + ", DateOfBirth=" + DateOfBirth + ", ProfilePic=" + ProfilePic
				+ ", UpateOn=" + UpateOn + ", CreatedOn=" + CreatedOn + ", Enabled=" + Enabled + "]";
	}

	
	
	
	
}
