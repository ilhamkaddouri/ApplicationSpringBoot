package com.example.TP2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NonNull
	private String nom;
	private String prenom;
	
	
}
