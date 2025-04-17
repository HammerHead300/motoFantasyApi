package com.motoFantasy.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "FactoryResults")
@Data
public class TeamResults {
	@Id
	private String id;
	private String teamId;
	private Integer gpRound;

	private Integer team1stDriverSprintPosition;
	private Integer team1stDriverSprintPositionPoints;

	private Integer team2ndDriverSprintPosition;
	private Integer team2ndDriverSprintPositionPoints;

	private Integer team1stDriverLongPosition;
	private Integer team1stDriverLongPositionPoints;

	private Integer team2ndDriverLongPosition;
	private Integer team2ndDriverLongPositionPoints;

	private Integer GPSprintPoints;
	private Integer GPLongPoints;
	
	public Integer getGPSprintPoints() {
		return GPSprintPoints;
	}
	public void setGPSprintPoints(Integer gPSprintPoints) {
		GPSprintPoints = gPSprintPoints;
	}
	public Integer getGPLongPoints() {
		return GPLongPoints;
	}
	public void setGPLongPoints(Integer gPLongPoints) {
		GPLongPoints = gPLongPoints;
	}
	public String getTeamId() {
		return teamId;
	}
	public Integer getGpRound() {
		return gpRound;
	}
	public Integer getTeam1stDriverSprintPosition() {
		return team1stDriverSprintPosition;
	}
	public Integer getTeam1stDriverSprintPositionPoints() {
		return team1stDriverSprintPositionPoints;
	}
	public Integer getTeam2ndDriverSprintPosition() {
		return team2ndDriverSprintPosition;
	}
	public Integer getTeam2ndDriverSprintPositionPoints() {
		return team2ndDriverSprintPositionPoints;
	}
	public Integer getTeam1stDriverLongPosition() {
		return team1stDriverLongPosition;
	}
	public Integer getTeam1stDriverLongPositionPoints() {
		return team1stDriverLongPositionPoints;
	}
	public Integer getTeam2ndDriverLongPosition() {
		return team2ndDriverLongPosition;
	}
	public Integer getTeam2ndDriverLongPositionPoints() {
		return team2ndDriverLongPositionPoints;
	}
	
	
}
