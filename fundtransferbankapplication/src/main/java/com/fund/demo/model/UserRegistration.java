package com.fund.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.catalina.User;

@Entity
@Table(name="userregistration")
public class UserRegistration {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String firstname;
	 private String lastname;
	 private String email;
	 private int phonenumber;
	 private int Pannumber;
	 @OneToOne(cascade = CascadeType.ALL)
	 private Account account;
	 
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getPannumber() {
		return Pannumber;
	}
	public void setPannumber(int pannumber) {
		Pannumber = pannumber;
	}
	



	}
