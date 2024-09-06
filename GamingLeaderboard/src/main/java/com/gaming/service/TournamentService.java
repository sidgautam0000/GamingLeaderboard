package com.gaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gaming.entities.Tournament;

@Service
public interface TournamentService {
	
	Tournament createTournament(Tournament tour);
	
	Optional<Tournament> getTournamentById(int toid);
	
	Tournament updateTournament(Tournament tour);
	
	void deleteTournament(int toid);
	
	List<Tournament> getAllTournament();
	
	List<Tournament> getTournamentsByStatus(String status);
	
	List<Tournament> getTournamentsByTeam(int teamId);
	 
	
	
}
