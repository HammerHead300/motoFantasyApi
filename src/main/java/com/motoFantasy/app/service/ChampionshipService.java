package com.motoFantasy.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motoFantasy.app.model.Championship;
import com.motoFantasy.app.repository.ChampionshipRepository;

@Service
public class ChampionshipService {
	private final ChampionshipRepository championshipRepository;
	
	@Autowired
	public ChampionshipService(ChampionshipRepository championshipRepository) {
		this.championshipRepository = championshipRepository;
	}
	public void save(Championship championship) {
		championshipRepository.save(championship);
	}
	public List<Championship> findAll(){
		return championshipRepository.findAll();
	}
	public Optional<Championship> findById(String id) {
		return championshipRepository.findById(id);
	}
	public void delete(String id) {
		championshipRepository.deleteById(id);
	}
	
}