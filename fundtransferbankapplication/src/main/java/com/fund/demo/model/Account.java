package com.fund.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq" , initialValue=100000000, allocationSize=1)
public class Account {
	

	@GeneratedValue(strategy=GenerationType.SEQUENCE )
    @Id
	private int aid;
	private int accountid;
	private Date createddate;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uid")
	private UserRegistration userregistration;
	
	public int getId() {
		return aid;
	}
	public void setId(int id) {
		this.aid = id;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public UserRegistration getUserregistration() {
		return userregistration;
	}
	public void setUserregistration(UserRegistration userregistration) {
		this.userregistration = userregistration;
	}
	
	
	
	
	
	
}

