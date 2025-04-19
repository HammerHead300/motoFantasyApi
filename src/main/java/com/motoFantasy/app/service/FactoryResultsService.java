package com.motoFantasy.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motoFantasy.app.model.FactoryResults;
import com.motoFantasy.app.repository.FactoryResultsRepository;

@Service
public class FactoryResultsService {
	private final FactoryResultsRepository factoryResultsRepository;
	
	@Autowired
	public FactoryResultsService(FactoryResultsRepository factoryResultsRepository) {
		this.factoryResultsRepository = factoryResultsRepository;
	}
	public void save(FactoryResults factoryResults) {
		factoryResultsRepository.save(factoryResults);
	}
	public List<FactoryResults> findAll(){
		return factoryResultsRepository.findAll();
	}
	public Optional<FactoryResults> findById(String id) {
		return factoryResultsRepository.findById(id);
	}
	public void delete(String id) {
		factoryResultsRepository.deleteById(id);
	}
	
}
