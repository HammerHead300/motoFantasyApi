package com.motoFantasy.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "Factory")
@Data
public class Factory {
	@Id
	private String id;
	private List<String> FactoryDriversNames;
	private String color;
	private String championship;
	private Integer championshipPosition;
	private Integer price;
	
	public List<String> getFactoryDriversNames() {
		return FactoryDriversNames;
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
	public String getcolor() {
		return color;
	}
	
}
