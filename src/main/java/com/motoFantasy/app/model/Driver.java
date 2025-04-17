package com.motoFantasy.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "Driver")
@Data
public class Driver {
	@Id
	private String id;
	private String name;
	private String number;
	private String championship;
	private Integer price;
	
	
}
