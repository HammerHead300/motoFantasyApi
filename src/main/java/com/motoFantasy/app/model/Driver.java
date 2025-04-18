package com.motoFantasy.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "Drivers")
@Data
public class Driver {
	@Id
	private String id;
	private String name;
	private String number;
	private String championship;
	private Integer championshipPosition;
	private Integer price;
	
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
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
