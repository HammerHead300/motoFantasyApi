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

import com.motoFantasy.app.model.Team;
import com.motoFantasy.app.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {
	private final TeamService teamService;
	
	public TeamController(TeamService teamService) {
		this.teamService = teamService;
	}
	
	//GetMapping function that shows every team
	@GetMapping("/find/all")
	public List<Team> findAllTeams(){
		return teamService.findAll();
	}
	
	//GetMapping function that shows a team with an specific id
	@GetMapping("/find/{id}")
	public Team findTeamById(@PathVariable("id")String id) {
		return teamService.findById(id).get();
	}
	
	//PostMapping function that adds a team
	@PostMapping("/add")
	public void addTeam(@RequestBody Team team) {
		teamService.save(team);
	}
	
	//DeleteMapping function that deletes a team
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable String id) {
		teamService.delete(id);
	}
	
	//PutMapping function that edits an specific team
	@PutMapping("/update")
	public void update(@RequestBody Team team) {
		teamService.save(team);
	}
}
