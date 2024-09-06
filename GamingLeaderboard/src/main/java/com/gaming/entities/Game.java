package com.gaming.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Game")
public class Game {
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int gid;
	
	private String name;
	
	private String description;
	
	@OneToMany(mappedBy="gameid")
	 @JsonManagedReference //serialize this side of the relationship
	private List<Score> scores;
	
	public Game(int gid, String name, String description, List<Score> scores) {
		super();
		this.gid = gid;
		this.name = name;
		this.description = description;
		this.scores = scores;
	}
	public Game() {
		
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<Score> getScores() {
		return scores;
	}
	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
	@Override
	public String toString() {
		return "Game [gid=" + gid + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
}
