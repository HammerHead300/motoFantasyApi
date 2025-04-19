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

import com.motoFantasy.app.model.DriverResults;
import com.motoFantasy.app.service.DriverResultsService;

@RestController
@RequestMapping("/driverResults")
public class DriverResultsController {
	private final DriverResultsService driverResultsService;
	
	public DriverResultsController(DriverResultsService driverResultsService) {
		this.driverResultsService = driverResultsService;
	}
	
	//GetMapping function that shows every driverResults
	@GetMapping("/find/all")
	public List<DriverResults> findAllDriverResultss(){
		return driverResultsService.findAll();
	}
	
	//GetMapping function that shows a driverResults with an specific id
	@GetMapping("/find/{id}")
	public DriverResults findDriverResultsById(@PathVariable("id")String id) {
		return driverResultsService.findById(id).get();
	}
	
	//PostMapping function that adds a driverResults
	@PostMapping("/add")
	public void addDriverResults(@RequestBody DriverResults driverResults) {
		driverResultsService.save(driverResults);
	}
	
	//DeleteMapping function that deletes a driverResults
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable String id) {
		driverResultsService.delete(id);
	}
	
	//PutMapping function that edits an specific driverResults
	@PutMapping("/update")
	public void update(@RequestBody DriverResults driverResults) {
		driverResultsService.save(driverResults);
	}
}
