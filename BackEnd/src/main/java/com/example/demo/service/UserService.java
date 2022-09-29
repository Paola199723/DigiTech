package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import java.util.Optional;

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
		Optional<UserModel> data = repository.findByemail(user.getEMail());
		if(data.isEmpty()) {
			repository.save(user);
			return"Usuario guardado";
			
		}
		return "Usuario ya existe";
		
	}
	
	public boolean loginUser(UserModel user) {
		Optional<UserModel> data = repository.findByemail(user.getEMail());
		if(data.isEmpty()) {
			if(data.get().getPassword().equals(user.getPassword())==true){
				return true;
			}
		}
		return false;
	}
	
	public Optional<UserModel> getUserModel(UserModel user) {
		Optional<UserModel> data = repository.findByemail(user.getEMail());
		return data;
	}
	
	public UserModel UserId(Integer id) {
		return repository.findById(id).get();
	}
	
	
}
