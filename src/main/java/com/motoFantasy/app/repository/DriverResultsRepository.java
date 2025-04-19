package com.motoFantasy.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.motoFantasy.app.model.DriverResults;

@Repository
public interface DriverResultsRepository extends MongoRepository<DriverResults, String>{

}
