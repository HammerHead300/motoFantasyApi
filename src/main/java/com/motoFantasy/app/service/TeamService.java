package com.motoFantasy.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motoFantasy.app.model.Team;
import com.motoFantasy.app.repository.TeamRepository;

@Service
public class TeamService {
	private final TeamRepository teamRepository;
	
	@Autowired
	public TeamService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}
	public void save(Team team) {
		teamRepository.save(team);
	}
	public List<Team> findAll(){
		return teamRepository.findAll();
	}
	public Optional<Team> findById(String id) {
		return teamRepository.findById(id);
	}
	public void delete(String id) {
		teamRepository.deleteById(id);
	}
	
}
