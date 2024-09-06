package com.gaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaming.entities.Tournament;
import com.gaming.repository.TournamentRepo;

@Service
public class TournamentServiceImpl implements TournamentService{

	@Autowired
	TournamentRepo torepo;
	
	@Override
	public Tournament createTournament(Tournament tour) {
		
		return torepo.save(tour);
	}

	@Override
	public Optional<Tournament> getTournamentById(int toid) {
		return torepo.findById(toid);
	}

	@Override
	public Tournament updateTournament(Tournament tour) {
		return torepo.save(tour);
	}

	@Override
	public void deleteTournament(int toid) {
		torepo.deleteById(toid);;
		
	}

	@Override
	public List<Tournament> getAllTournament() {
		return torepo.findAll();
	}

	@Override
	public List<Tournament> getTournamentsByStatus(String status) {
		
		return torepo.findByStatusContainingIgnoreCase( status);
	}

	@Override
	public List<Tournament> getTournamentsByTeam(int teamId) {
		
		return torepo.findByTeams_Tid(teamId);
	}

}
