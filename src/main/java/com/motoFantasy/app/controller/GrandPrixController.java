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

import com.motoFantasy.app.model.GrandPrix;
import com.motoFantasy.app.service.GrandPrixService;

@RestController
@RequestMapping("/grandPrix")
public class GrandPrixController {
	private final GrandPrixService grandPrixService;
	
	public GrandPrixController(GrandPrixService grandPrixService) {
		this.grandPrixService = grandPrixService;
	}
	
	//GetMapping function that shows every grandPrix
	@GetMapping("/find/all")
	public List<GrandPrix> findAllGrandPrixs(){
		return grandPrixService.findAll();
	}
	
	//GetMapping function that shows a grandPrix with an specific id
	@GetMapping("/find/{id}")
	public GrandPrix findGrandPrixById(@PathVariable("id")String id) {
		return grandPrixService.findById(id).get();
	}
	
	//PostMapping function that adds a grandPrix
	@PostMapping("/add")
	public void addGrandPrix(@RequestBody GrandPrix grandPrix) {
		grandPrixService.save(grandPrix);
	}
	
	//DeleteMapping function that deletes a grandPrix
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable String id) {
		grandPrixService.delete(id);
	}
	
	//PutMapping function that edits an specific grandPrix
	@PutMapping("/update")
	public void update(@RequestBody GrandPrix grandPrix) {
		grandPrixService.save(grandPrix);
	}
}
