package com.motoFantasy.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.motoFantasy.app.model.Team;

@Repository
public interface TeamRepository extends MongoRepository<Team, String>{

}
