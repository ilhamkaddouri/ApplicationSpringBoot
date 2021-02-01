package com.example.TP2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.TP2.model.Etudiant;

public interface EtudianRepository extends JpaRepository<Etudiant, Integer>{

	public void hello();
}
