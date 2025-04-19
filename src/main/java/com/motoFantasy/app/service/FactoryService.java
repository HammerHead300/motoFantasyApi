package com.motoFantasy.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motoFantasy.app.model.Factory;
import com.motoFantasy.app.repository.FactoryRepository;

@Service
public class FactoryService {
	private final FactoryRepository factoryRepository;
	
	@Autowired
	public FactoryService(FactoryRepository factoryRepository) {
		this.factoryRepository = factoryRepository;
	}
	public void save(Factory factory) {
		factoryRepository.save(factory);
	}
	public List<Factory> findAll(){
		return factoryRepository.findAll();
	}
	public Optional<Factory> findById(String id) {
		return factoryRepository.findById(id);
	}
	public void delete(String id) {
		factoryRepository.deleteById(id);
	}
	
}
