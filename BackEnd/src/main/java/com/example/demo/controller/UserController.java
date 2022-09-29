package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	private UserService Servicio;
	
	@PostMapping("/singup")
	public ResponseEntity<Map<String,String>> singUp(@RequestBody UserModel user){
		Map<String,String> mensage = new HashMap<>();
		String response = Servicio.RegisterUser(user);
		mensage.put("msj", response);
		return new ResponseEntity<>(mensage,null,HttpStatus.OK);
	}
	
	@GetMapping("login")
	public ResponseEntity<Object> login(@RequestBody UserModel user){
		
		Map<String,Object> mensage = new HashMap<>();
		
		//if(Servicio.loginUser(user)==true) {
			Optional<UserModel> data = Servicio.getUserModel(user);
			if(data.get().getPassword().equals(user.getPassword()))
			{
				data.get().setEMail(user.getEMail());
				mensage.put("User", data);
				mensage.put("msj", "login exitoso");
			}else {
			mensage.put("msj", "Usuario o password incorrecto");
			}
			
		
		return new ResponseEntity<>(mensage,null,HttpStatus.OK);
	}

}
