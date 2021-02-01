package com.example.TP2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.TP2.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
}
