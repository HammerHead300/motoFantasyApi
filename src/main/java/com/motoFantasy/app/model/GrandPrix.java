package com.motoFantasy.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "GPs")
@Data
public class GrandPrix {
	@Id
	private String id;
	private String ChampionshipId;
	private Integer roundNumber;
	private String roundName;
	private String circuitName;
	
	public String getChampionshipId() {
		return ChampionshipId;
	}
	public Integer getRoundNumber() {
		return roundNumber;
	}
	public String getRoundName() {
		return roundName;
	}
	public String getCircuitName() {
		return circuitName;
	}
	
	
}
