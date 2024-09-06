package com.gaming.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Score")
public class Score {
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonBackReference
	private Users userid;
	
	@ManyToOne	
	@JoinColumn(name="game_id")
	@JsonBackReference//prevents infinite recursion
	private Game gameid;
	
	private int score;
	
	private String timestamp;
	public Score(int sid, Users userid, Game gameid, int score, String timestamp) {
		super();
		this.sid = sid;
		this.userid = userid;
		this.gameid = gameid;
		this.score = score;
		this.timestamp = timestamp;
	}
	public Score() {
		
	}
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Users getUserid() {
		return userid;
	}

	public void setUserid(Users userid) {
		this.userid = userid;
	}

	public Game getGameid() {
		return gameid;
	}

	public void setGameid(Game gameid) {
		this.gameid = gameid;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Score [sid=" + sid + ", userid=" + userid + ", gameid=" + gameid + ", score=" + score + ", timestamp="
				+ timestamp + "]";
	}
	
	
	 
}
