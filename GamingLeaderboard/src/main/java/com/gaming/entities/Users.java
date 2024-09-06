package com.gaming.entities;

import java.util.List;

//import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class Users{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uid;
	private String username;
	private String password;
	@ManyToOne
	@JoinColumn(name="team_id")
	@JsonBackReference
	private Teams team;
	@OneToMany(mappedBy="userid")
	@JsonManagedReference
	private List<Score> scores;
	public Users(int uid, String username, String password, Teams team, List<Score> scores) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.team = team;
		this.scores = scores;
	}
	public Users() {
		
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Teams getTeam() {
		return team;
	}
	public void setTeam(Teams team) {
		this.team = team;
	}
	public List<Score> getScores() {
		return scores;
	}
	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", team=" + team + ", scores="
				+ scores + "]";
	}
	
	
	
}
