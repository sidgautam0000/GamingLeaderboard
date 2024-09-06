package com.gaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gaming.entities.Teams;

@Service
public interface TeamsService {

	public Teams createTeam(Teams team);
	
	public Optional<Teams> getTeamById(int id);
	
	public void updateTeam(Teams team);
	
	public void deleteTeam(int id);
	
	public List<Teams> getAllTeams();
	
}
