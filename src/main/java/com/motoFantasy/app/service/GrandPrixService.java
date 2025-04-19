package com.motoFantasy.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motoFantasy.app.model.GrandPrix;
import com.motoFantasy.app.repository.GrandPrixRepository;

@Service
public class GrandPrixService {
	private final GrandPrixRepository grandPrixRepository;
	
	@Autowired
	public GrandPrixService(GrandPrixRepository grandPrixRepository) {
		this.grandPrixRepository = grandPrixRepository;
	}
	public void save(GrandPrix grandPrix) {
		grandPrixRepository.save(grandPrix);
	}
	public List<GrandPrix> findAll(){
		return grandPrixRepository.findAll();
	}
	public Optional<GrandPrix> findById(String id) {
		return grandPrixRepository.findById(id);
	}
	public void delete(String id) {
		grandPrixRepository.deleteById(id);
	}
	
}
