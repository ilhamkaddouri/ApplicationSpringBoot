package com.example.TP2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.JobLauncherCommandLineRunner;

import com.example.TP2.Repo.UserRepo;
import com.example.TP2.model.User;


@SpringBootApplication
public class Tp2Application{
	
	
	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);
		System.out.println("tetsing");
	}



}
