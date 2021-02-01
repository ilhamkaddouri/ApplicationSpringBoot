package com.example.TP2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.TP2.model.Module;
import com.example.TP2.service.ModuleService;

@RestController 
public class ModuleController { 
	@Autowired 
	private ModuleService moduleService; 
	@RequestMapping("/modules")  
	public List<Module> getModules() {
		System.out.println("modules");
	 	return moduleService.getAllModules();
	}
	@RequestMapping(method=RequestMethod.POST, value="/modules") 
	public void ajouterModule(@RequestBody Module module) {
		System.out.println("tetsed post succefully");
	 moduleService.ajouterModule(module); 
	 }
	
	@RequestMapping(method=RequestMethod.DELETE,value="/modules/delete{id}")
	public void deleteModule(@PathVariable int id) {
		moduleService.supprimerModule(id);
	}
	/*
	 * @RequestMapping("/modules/{id}") public Module getModule(@PathVariable
	 * Integer id){ return moduleService.getModule(id); }
	 * 
	 * @RequestMapping(method=RequestMethod.POST, value="/modules") public void
	 * ajouterModule(@RequestBody Module module) {
	 * moduleService.ajouterModule(module); }
	 * 
	 * @RequestMapping(method=RequestMethod.PUT, value="/modules/{id}") public void
	 * modifierModule(@RequestBody Module module, @PathVariable Integer id) {
	 * moduleService.modifierModule(id, module); }
	 * 
	 * @RequestMapping(method=RequestMethod.DELETE, value="/modules/{id}") public
	 * void supprimerModule(@PathVariable Integer id) {
	 * moduleService.supprimerModule(id); }
	 */
}
