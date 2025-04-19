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

import com.motoFantasy.app.model.FactoryResults;
import com.motoFantasy.app.service.FactoryResultsService;

@RestController
@RequestMapping("/factoryResults")
public class FactoryResultsController {
	private final FactoryResultsService factoryResultsService;
	
	public FactoryResultsController(FactoryResultsService factoryResultsService) {
		this.factoryResultsService = factoryResultsService;
	}
	
	//GetMapping function that shows every factoryResults
	@GetMapping("/find/all")
	public List<FactoryResults> findAllFactoryResultss(){
		return factoryResultsService.findAll();
	}
	
	//GetMapping function that shows a factoryResults with an specific id
	@GetMapping("/find/{id}")
	public FactoryResults findFactoryResultsById(@PathVariable("id")String id) {
		return factoryResultsService.findById(id).get();
	}
	
	//PostMapping function that adds a factoryResults
	@PostMapping("/add")
	public void addFactoryResults(@RequestBody FactoryResults factoryResults) {
		factoryResultsService.save(factoryResults);
	}
	
	//DeleteMapping function that deletes a factoryResults
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable String id) {
		factoryResultsService.delete(id);
	}
	
	//PutMapping function that edits an specific factoryResults
	@PutMapping("/update")
	public void update(@RequestBody FactoryResults factoryResults) {
		factoryResultsService.save(factoryResults);
	}
}
