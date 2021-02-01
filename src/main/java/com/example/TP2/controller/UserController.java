package com.example.TP2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TP2.model.User;
import com.example.TP2.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;
	
	@RequestMapping(method = RequestMethod.GET,value="/users")
	public List<User> getUsers(){
		return userservice.getusers();
	}
	
	
}
