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

import com.motoFantasy.app.model.Championship;
import com.motoFantasy.app.service.ChampionshipService;

@RestController
@RequestMapping("/championship")
public class ChampionshipController {
	private final ChampionshipService championshipService;
	
	public ChampionshipController(ChampionshipService championshipService) {
		this.championshipService = championshipService;
	}
	
	//GetMapping function that shows every championship
	@GetMapping("/find/all")
	public List<Championship> findAllChampionships(){
		return championshipService.findAll();
	}
	
	//GetMapping function that shows a championship with an specific id
	@GetMapping("/find/{id}")
	public Championship findChampionshipById(@PathVariable("id")String id) {
		return championshipService.findById(id).get();
	}
	
	//PostMapping function that adds a championship
	@PostMapping("/add")
	public void addChampionship(@RequestBody Championship championship) {
		championshipService.save(championship);
	}
	
	//DeleteMapping function that deletes a championship
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable String id) {
		championshipService.delete(id);
	}
	
	//PutMapping function that edits an specific championship
	@PutMapping("/update")
	public void update(@RequestBody Championship championship) {
		championshipService.save(championship);
	}
}
