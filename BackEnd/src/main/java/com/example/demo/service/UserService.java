package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserModel> listarRegister(){
		return repository.findAll();
	}
	
	/*
	 * Function name: RegisterUser
	 * 
	 * parameters: Objecte UserModel
	 * 
	 * operation: registers a user, and returns
	 * a String message indicating the status of
	 *  the user to be registered. 
	 * 
	 * */
	
	public String RegisterUser(UserModel user) {
		return"dato completo";
	}
	
	public UserModel UserId(Integer id) {
		return repository.findById(id).get();
	}
	
	
}
