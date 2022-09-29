package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

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
	
	@PostMapping("/singUp")
	public ResponseEntity<Map<String,String>> singUp(@RequestBody UserModel user){
		Map<String,String> mensage = new HashMap<>();
		//String response = Servicio.RegisterUser(user);
		mensage.put("msj", "response");
		return new ResponseEntity<>(mensage,null,HttpStatus.OK);
	}
	
	@GetMapping("login")
	public ResponseEntity<Object> login(){
		
		Map<String,String> mensage = new HashMap<>();
		mensage.put("msj", "registro exitoso");
		return new ResponseEntity<>(mensage,null,HttpStatus.OK);
	}

}
