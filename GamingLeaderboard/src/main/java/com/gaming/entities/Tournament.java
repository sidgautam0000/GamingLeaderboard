package com.gaming.entities;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tournament")
public class Tournament {

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int toid;
	
	private String toname;
	
	private String startDate;
	
	private String status;
	@ManyToOne
	@JoinColumn(name = "winner_id")
	 @JsonBackReference // Prevents infinite recursion from Tournament -> Teams -> Tournament
	private Teams winner;
	
	@ManyToMany
	@JoinTable(name = "tournament_team", 
		joinColumns = 
		@JoinColumn(name = "tournament_id"), 
		inverseJoinColumns = 
		@JoinColumn(name = "team_id"))
	 @JsonManagedReference 
	private List<Teams> teams;
	public Tournament(int toid, String toname, String startDate, String status, Teams winner,
			List<Teams> teams) {
		super();
		this.toid = toid;
		this.toname = toname;
		this.startDate = startDate;
		this.status = status;
		this.winner = winner;
		this.teams = teams;
	}
	
	public Tournament() {}
	
	public int getToid() {
		return toid;
	}
	public void setToid(int toid) {
		this.toid = toid;
	}
	public String getToname() {
		return toname;
	}
	public void setToname(String toname) {
		this.toname = toname;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Teams getWinner() {
		return winner;
	}
	public void setWinner(Teams winner) {
		this.winner = winner;
	}
	public List<Teams> getTeams() {
		return teams;
	}
	public void setTeams(List<Teams> teams) {
		this.teams = teams;
	}
	@Override
	public String toString() {
		return "Tournament [toid=" + toid + ", toname=" + toname + ", startDate=" + startDate + ", status=" + status
				+ ", winner=" + winner + ", teams=" + teams + "]";
	}

	

}
