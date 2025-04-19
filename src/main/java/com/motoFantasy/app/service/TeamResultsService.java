package com.motoFantasy.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motoFantasy.app.model.TeamResults;
import com.motoFantasy.app.repository.TeamResultsRepository;

@Service
public class TeamResultsService {
	private final TeamResultsRepository teamResultsRepository;
	
	@Autowired
	public TeamResultsService(TeamResultsRepository teamResultsRepository) {
		this.teamResultsRepository = teamResultsRepository;
	}
	public void save(TeamResults teamResults) {
		teamResultsRepository.save(teamResults);
	}
	public List<TeamResults> findAll(){
		return teamResultsRepository.findAll();
	}
	public Optional<TeamResults> findById(String id) {
		return teamResultsRepository.findById(id);
	}
	public void delete(String id) {
		teamResultsRepository.deleteById(id);
	}
	
}
