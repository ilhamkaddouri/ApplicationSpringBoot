package com.example.TP2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TP2.Repo.ModuleRepository;
import com.example.TP2.model.Module;

@Service
public class ModuleService {	
	@Autowired
	private ModuleRepository moduleRepository;
	public List<Module> getAllModules() { 
		List<Module> modules=new ArrayList<>();
		//moduleRepository.findAll();
		moduleRepository.findAll().forEach(m->modules.add(m));
		return modules; 
	}
	
	
	public void ajouterModule(Module module) {
		
		moduleRepository.save(module);
	}
	public Optional<Module> getModule(Integer id) {
		return moduleRepository.findById(id);
	}

	public void supprimerModule(Integer id) {
		 moduleRepository.deleteById(id);
	}
	public Module modifierModule(Integer id,Module module) {
		return moduleRepository.save(module);
		
	}
	
	

}

