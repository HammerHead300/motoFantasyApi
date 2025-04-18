package com.motoFantasy.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "Championships")
@Data
public class Championship {
	@Id
	private String id;
	private String name;
	private List<String> gpList;
	
	public String getName() {
		return name;
	}
	public List<String> getGpList() {
		return gpList;
	}
	
}
