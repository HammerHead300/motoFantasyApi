package com.motoFantasy.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "FactoryResults")
@Data
public class FactoryResults {
	@Id
	private String id;
	private String factoryId;
	private Integer gpRound;
	
	private Integer factory1stDriverSprintPosition;
	private Integer factory1stDriverSprintPositionPoints;
	
	private Integer factory2ndDriverSprintPosition;
	private Integer factory2ndDriverSprintPositionPoints;
	
	private Integer factory1stDriverLongPosition;
	private Integer factory1stDriverLongPositionPoints;
	
	private Integer factory2ndDriverLongPosition;
	private Integer factory2ndDriverLongPositionPoints;
	
	private Integer GPSprintPoints;
	private Integer GPLongPoints;
	
	public Integer getGPSprintPoints() {
		return GPSprintPoints;
	}
	public void setGPSprintPoints(Integer factoryGPSprintPoints) {
		this.GPSprintPoints = factoryGPSprintPoints;
	}
	public Integer getGPLongPoints() {
		return GPLongPoints;
	}
	public void setGPLongPoints(Integer factoryGPLongPoints) {
		this.GPLongPoints = factoryGPLongPoints;
	}
	public String getId() {
		return id;
	}
	public String getFactoryId() {
		return factoryId;
	}
	public Integer getGpRound() {
		return gpRound;
	}
	public Integer getFactory1stDriverSprintPosition() {
		return factory1stDriverSprintPosition;
	}
	public Integer getFactory1stDriverSprintPositionPoints() {
		return factory1stDriverSprintPositionPoints;
	}
	public Integer getFactory2ndDriverSprintPosition() {
		return factory2ndDriverSprintPosition;
	}
	public Integer getFactory2ndDriverSprintPositionPoints() {
		return factory2ndDriverSprintPositionPoints;
	}
	public Integer getFactory1stDriverLongPosition() {
		return factory1stDriverLongPosition;
	}
	public Integer getFactory1stDriverLongPositionPoints() {
		return factory1stDriverLongPositionPoints;
	}
	public Integer getFactory2ndDriverLongPosition() {
		return factory2ndDriverLongPosition;
	}
	public Integer getFactory2ndDriverLongPositionPoints() {
		return factory2ndDriverLongPositionPoints;
	}
	
	
}
