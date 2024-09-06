package com.gaming.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Teams")
public class Teams {

	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tid;
	
	private String tname;
	
	@OneToMany(mappedBy="team",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	 @JsonManagedReference 
	private List<Users> members;
	private String createdAt;
	@ManyToMany(mappedBy="teams")
	 @JsonBackReference 
	private List<Tournament> tournaments;
	@OneToMany(mappedBy="winner")
	 @JsonBackReference 
	private List<Tournament> wonTournaments;
	
	

	public Teams(int tid, String tname, List<Users> members, String createdAt, List<Tournament> tournaments,
			List<Tournament> wonTournaments) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.members = members;
		this.createdAt = createdAt;
		this.tournaments = tournaments;
		this.wonTournaments = wonTournaments;
	}

	public Teams() {
		
	}
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public List<Users> getMembers() {
		return members;
	}

	public void setMembers(List<Users> members) {
		this.members = members;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public List<Tournament> getTournaments() {
		return tournaments;
	}

	public void setTournaments(List<Tournament> tournaments) {
		this.tournaments = tournaments;
	}

	public List<Tournament> getWonTournaments() {
		return wonTournaments;
	}

	public void setWonTournaments(List<Tournament> wonTournaments) {
		this.wonTournaments = wonTournaments;
	}

	@Override
	public String toString() {
		return "Teams [tid=" + tid + ", tname=" + tname + ", members=" + members + ", createdAt=" + createdAt
				+ ", tournaments=" + tournaments + ", wonTournaments=" + wonTournaments + "]";
	}

	

}
