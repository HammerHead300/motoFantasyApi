package com.motoFantasy.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.motoFantasy.app.model.TeamResults;

@Repository
public interface TeamResultsRepository extends MongoRepository<TeamResults, String>{

}
