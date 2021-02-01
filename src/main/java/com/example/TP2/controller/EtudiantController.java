package com.example.TP2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TP2.model.Etudiant;
import com.example.TP2.service.EtudiantService;

@RestController
public class EtudiantController {
	@Autowired
	private EtudiantService etdservuce;
	
	@RequestMapping(method = RequestMethod.POST,value="/api/getall/{id}")
	public void getEtudiants(@PathVariable int id,@RequestBody Etudiant e){
		etdservuce.ajouterEtudiant(e);
	}

}
