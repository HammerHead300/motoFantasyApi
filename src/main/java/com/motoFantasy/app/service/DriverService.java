package com.motoFantasy.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motoFantasy.app.model.Driver;
import com.motoFantasy.app.repository.DriverRepository;

@Service
public class DriverService {
	private final DriverRepository driverRepository;
	
	@Autowired
	public DriverService(DriverRepository driverRepository) {
		this.driverRepository = driverRepository;
	}
	public void save(Driver driver) {
		driverRepository.save(driver);
	}
	public List<Driver> findAll(){
		return driverRepository.findAll();
	}
	public Optional<Driver> findById(String id) {
		return driverRepository.findById(id);
	}
	public void delete(String id) {
		driverRepository.deleteById(id);
	}
	
}
