package com.motoFantasy.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motoFantasy.app.model.Factory;
import com.motoFantasy.app.service.FactoryService;

@RestController
@RequestMapping("/factory")
public class FactoryController {
	private final FactoryService factoryService;
	
	public FactoryController(FactoryService factoryService) {
		this.factoryService = factoryService;
	}
	
	//GetMapping function that shows every factory
	@GetMapping("/find/all")
	public List<Factory> findAllFactorys(){
		return factoryService.findAll();
	}
	
	//GetMapping function that shows a factory with an specific id
	@GetMapping("/find/{id}")
	public Factory findFactoryById(@PathVariable("id")String id) {
		return factoryService.findById(id).get();
	}
	
	//PostMapping function that adds a factory
	@PostMapping("/add")
	public void addFactory(@RequestBody Factory factory) {
		factoryService.save(factory);
	}
	
	//DeleteMapping function that deletes a factory
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable String id) {
		factoryService.delete(id);
	}
	
	//PutMapping function that edits an specific factory
	@PutMapping("/update")
	public void update(@RequestBody Factory factory) {
		factoryService.save(factory);
	}
}
