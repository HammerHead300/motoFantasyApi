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

import com.motoFantasy.app.model.TeamResults;
import com.motoFantasy.app.service.TeamResultsService;

@RestController
@RequestMapping("/teamResults")
public class TeamResultsController {
	private final TeamResultsService teamResultsService;
	
	public TeamResultsController(TeamResultsService teamResultsService) {
		this.teamResultsService = teamResultsService;
	}
	
	//GetMapping function that shows every teamResults
	@GetMapping("/find/all")
	public List<TeamResults> findAllTeamResultss(){
		return teamResultsService.findAll();
	}
	
	//GetMapping function that shows a teamResults with an specific id
	@GetMapping("/find/{id}")
	public TeamResults findTeamResultsById(@PathVariable("id")String id) {
		return teamResultsService.findById(id).get();
	}
	
	//PostMapping function that adds a teamResults
	@PostMapping("/add")
	public void addTeamResults(@RequestBody TeamResults teamResults) {
		teamResultsService.save(teamResults);
	}
	
	//DeleteMapping function that deletes a teamResults
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable String id) {
		teamResultsService.delete(id);
	}
	
	//PutMapping function that edits an specific teamResults
	@PutMapping("/update")
	public void update(@RequestBody TeamResults teamResults) {
		teamResultsService.save(teamResults);
	}
}
