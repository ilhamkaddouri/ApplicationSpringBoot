package com.example.TP2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TP2.Repo.EtudianRepository;
import com.example.TP2.model.Etudiant;


@Service
public class EtudiantService {
	
	@Autowired
	private EtudianRepository etudiantrepo ;
	
	public List<Etudiant> getAll() {
		return etudiantrepo.findAll();
	}
	
	public void ajouterEtudiant(Etudiant e) {
		
		 etudiantrepo.save(e);
	}
	
	
}
