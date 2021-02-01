package com.example.TP2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laaseq {
	
	@RequestMapping(method=RequestMethod.POST,value="/hello")
	public String helloword() {
		return "hello world";
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/hello/{id}")
	public void hey(@PathVariable int id) {
		System.out.println("hello"+id);
	}
}
