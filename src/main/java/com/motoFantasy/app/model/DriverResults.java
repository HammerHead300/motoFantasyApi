package com.motoFantasy.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "DriverResults")
@Data
public class DriverResults {
	
	@Id
	private String id;
	private String driverId;
	private Integer gpRound;
	
	private Integer practicesLeaded;
	private Integer practicesLeadedPoints;
	
	private Integer qualifyingResult;
	private Integer qualifyingResultPoints;
	
	private boolean q2DirectPass;
	private Integer q2DirectPassPoints;
	
	private boolean q1Pass;
	private Integer q1PassPoints;
	
	private Integer sprintPosition;
	private Integer sprintPositionPoints;
	
	private Integer positionsGainedSprint;
	private Integer positionsGainedSprintPoints;
	
	private boolean sprintDNF;
	private Integer sprintDNFPoints;
	
	private Integer longRacePosition;
	private Integer longRacePositionPoints;
	
	private Integer positionsGainedLong;
	private Integer positionsGainedLongPoints;
	
	private boolean longDNF;
	private Integer longDNFPoints;
	
	
	public String getDriverId() {
		return driverId;
	}
	public Integer getGpRound() {
		return gpRound;
	}
	public Integer getPracticesLeaded() {
		return practicesLeaded;
	}
	public Integer getPracticesLeadedPoints() {
		return practicesLeadedPoints;
	}
	public Integer getQualifyingResult() {
		return qualifyingResult;
	}
	public Integer getQualifyingResultPoints() {
		return qualifyingResultPoints;
	}
	public boolean isQ2DirectPass() {
		return q2DirectPass;
	}
	public Integer getQ2DirectPassPoints() {
		return q2DirectPassPoints;
	}
	public boolean isQ1Pass() {
		return q1Pass;
	}
	public Integer getQ1PassPoints() {
		return q1PassPoints;
	}
	public Integer getSprintPosition() {
		return sprintPosition;
	}
	public Integer getSprintPositionPoints() {
		return sprintPositionPoints;
	}
	public Integer getPositionsGainedSprint() {
		return positionsGainedSprint;
	}
	public Integer getPositionsGainedSprintPoints() {
		return positionsGainedSprintPoints;
	}
	public boolean isSprintDNF() {
		return sprintDNF;
	}
	public Integer getSprintDNFPoints() {
		return sprintDNFPoints;
	}
	public Integer getLongRacePosition() {
		return longRacePosition;
	}
	public Integer getLongRacePositionPoints() {
		return longRacePositionPoints;
	}
	public Integer getPositionsGainedLong() {
		return positionsGainedLong;
	}
	public Integer getPositionsGainedLongPoints() {
		return positionsGainedLongPoints;
	}
	public boolean isLongDNF() {
		return longDNF;
	}
	public Integer getLongDNFPoints() {
		return longDNFPoints;
	}
	
}
