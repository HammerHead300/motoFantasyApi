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

import com.motoFantasy.app.model.Driver;
import com.motoFantasy.app.service.DriverService;

@RestController
@RequestMapping("/driver")
public class DriverController {
	private final DriverService driverService;
	
	public DriverController(DriverService driverService) {
		this.driverService = driverService;
	}
	
	//GetMapping function that shows every driver
	@GetMapping("/find/all")
	public List<Driver> findAllDrivers(){
		return driverService.findAll();
	}
	
	//GetMapping function that shows a driver with an specific id
	@GetMapping("/find/{id}")
	public Driver findDriverById(@PathVariable("id")String id) {
		return driverService.findById(id).get();
	}
	
	//PostMapping function that adds a driver
	@PostMapping("/add")
	public void addDriver(@RequestBody Driver driver) {
		driverService.save(driver);
	}
	
	//DeleteMapping function that deletes a driver
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable String id) {
		driverService.delete(id);
	}
	
	//PutMapping function that edits an specific driver
	@PutMapping("/update")
	public void update(@RequestBody Driver driver) {
		driverService.save(driver);
	}
}
