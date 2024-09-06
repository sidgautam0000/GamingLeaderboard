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

import com.gaming.entities.Teams;
import com.gaming.service.TeamsService;

@RestController
public class TeamsController {

	@Autowired
	TeamsService tserve;
	
	@PostMapping("/teams")
	private Teams createTeam(@RequestBody Teams team) {
		return tserve.createTeam(team);
	}
	
	@GetMapping("/teams/{id}")
	private Optional<Teams> getTeam(@PathVariable("id") int id) {
		return tserve.getTeamById(id);
	}
	
	@PutMapping("/teams")
	private void updateTeam(@RequestBody Teams team) {
		tserve.updateTeam(team);
	}
	
	@DeleteMapping("/teams/{id}")
	private void DeleteTeam(@PathVariable("id") int id) {
		tserve.deleteTeam(id);
	}
	
	@GetMapping("/teams")
	private List<Teams> getAllTeams(){
		return tserve.getAllTeams();
	}
}
