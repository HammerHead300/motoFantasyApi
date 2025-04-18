package com.motoFantasy.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.motoFantasy.app.model.Driver;

@Repository
public interface DriverRepository extends MongoRepository<Driver, String>{
	

}
