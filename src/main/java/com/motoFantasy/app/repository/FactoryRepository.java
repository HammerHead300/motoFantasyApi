package com.motoFantasy.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.motoFantasy.app.model.Factory;

@Repository
public interface FactoryRepository extends MongoRepository<Factory, String> {

}
