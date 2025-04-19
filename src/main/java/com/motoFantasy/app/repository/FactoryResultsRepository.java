package com.motoFantasy.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.motoFantasy.app.model.FactoryResults;

@Repository
public interface FactoryResultsRepository extends MongoRepository<FactoryResults, String>{

}
