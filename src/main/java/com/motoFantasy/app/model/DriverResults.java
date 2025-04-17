package com.motoFantasy.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "DriverResults")
@Data
public class DriverResults {
	
	@Id
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
	
}
