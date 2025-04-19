package com.motoFantasy.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.motoFantasy.app.model.GrandPrix;

@Repository
public interface GrandPrixRepository extends MongoRepository<GrandPrix, String>{

}
