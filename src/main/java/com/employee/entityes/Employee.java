package com.employee.entityes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="fristName",nullable = false,length = 50)
	private String fristname;
	
	@Column(name="lastName",nullable = false,length = 50)
	private String lastname;
	
	@Column(name="email",nullable = false,unique = true,length = 255)
	private String email;
	
	@Column(name = "skills",nullable = false,length = 100)
	private String skills;
	
	@Column(name="sallery",nullable = false,length = 100000)
	private String sallery;
	
	@Column(name="mobile",nullable = false)
	private String mobile;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFristname() {
		return fristname;
	}
	public void setFristname(String fristname) {
		this.fristname = fristname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getSallery() {
		return sallery;
	}
	public void setSallery(String sallery) {
		this.sallery = sallery;
	}
	
	
}
