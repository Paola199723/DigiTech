package com.example.demo.model;


import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Entity
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String name;
	String lastName;
	String EMail;
	String password;
	
	
	public UserModel(String name, String lastName, String eMail, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		EMail = eMail;
		this.password = password;
	}
	public UserModel() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEMail() {
		return EMail;
	}
	public void setEMail(String eMail) {
		EMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validate(UserModel data) {
		if(Objects.isNull(data)) {
			return false;
		}
		return true;
	}
}
