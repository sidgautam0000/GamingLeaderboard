package com.gaming.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaming.entities.Tournament;
import com.gaming.service.TournamentService;

@RestController
public class TournamentController {

	@Autowired
	TournamentService toserve;
	
	@PostMapping("/tour")
	private Tournament createTournament(@RequestBody Tournament tour) {
		return toserve.createTournament(tour);
	}
	
	@GetMapping("/tour/{id}")
	private Optional<Tournament> getTournamentById(@PathVariable("id") int id ) { 
		return toserve.getTournamentById(id);
	}
	
	@PutMapping("/tour")
	private Tournament updateTournament(@RequestBody Tournament tour) {
		return toserve.updateTournament(tour);
	}
	
	@DeleteMapping("/tour/{id}")
	private void deleteTournament(@PathVariable("id") int id) {
		toserve.deleteTournament(id);
	}
	
	@GetMapping("/tour")
	private List<Tournament> getAllTournament(){
		return toserve.getAllTournament();
	}
	
	@GetMapping("/tours/{stat}")
	private List<Tournament> getTournamentByStatus(@PathVariable ("stat") String stat){
		return toserve.getTournamentsByStatus(stat);
	}
	
	@GetMapping("/tourst/{tid}")
	private List<Tournament> getTournamentByTeam(@PathVariable ("tid") int tid){
		return toserve.getTournamentsByTeam(tid);
	}
}
