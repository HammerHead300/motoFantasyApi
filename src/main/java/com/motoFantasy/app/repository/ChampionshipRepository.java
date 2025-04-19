package com.motoFantasy.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.motoFantasy.app.model.Championship;

@Repository
public interface ChampionshipRepository extends MongoRepository<Championship, String>{
	
}
