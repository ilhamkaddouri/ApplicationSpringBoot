package com.example.TP2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TP2.Repo.UserRepo;
import com.example.TP2.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userrepo ;
	
	public List<User> getusers(){
		return userrepo.findAll();
	}
	
	public void adduser(User user) {
		userrepo.save(user);
	}
}
