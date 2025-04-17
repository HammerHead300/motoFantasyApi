package com.motoFantasy.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "Team")
@Data
public class Team {
	@Id
	private String id;
	private List<String> TeamDriversNames;
	private String color;
	private String factoryName;
	private String championship;
	private Integer championshipPosition;
	private Integer price;
	
	public List<String> getTeamDriversNames() {
		return TeamDriversNames;
	}
	public String getcolor() {
		return color;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public String getChampionship() {
		return championship;
	}
	public Integer getChampionshipPosition() {
		return championshipPosition;
	}
	public Integer getPrice() {
		return price;
	}
	
}
