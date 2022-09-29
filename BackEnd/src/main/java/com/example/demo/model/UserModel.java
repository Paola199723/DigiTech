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
	Integer type;
	String name;
	String lastName;
	String email;
	String password;
	
	
	public UserModel(String name, String lastName, String email, String password, Integer type) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		// tipo de usuario : 1= cliente 0=  administrador banco
		this.type = type;
	}
	public UserModel() {
		super();
	}
	public Integer getid() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
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
		return email;
	}
	public void setEMail(String eMail) {
		email = eMail;
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
