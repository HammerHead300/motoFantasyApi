package com.motoFantasy.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motoFantasy.app.model.DriverResults;
import com.motoFantasy.app.repository.DriverResultsRepository;

@Service
public class DriverResultsService {
	private final DriverResultsRepository driverResultsRepository;
	
	@Autowired
	public DriverResultsService(DriverResultsRepository driverResultsRepository) {
		this.driverResultsRepository = driverResultsRepository;
	}
	public void save(DriverResults driverResults) {
		driverResultsRepository.save(driverResults);
	}
	public List<DriverResults> findAll(){
		return driverResultsRepository.findAll();
	}
	public Optional<DriverResults> findById(String id) {
		return driverResultsRepository.findById(id);
	}
	public void delete(String id) {
		driverResultsRepository.deleteById(id);
	}
	
}
