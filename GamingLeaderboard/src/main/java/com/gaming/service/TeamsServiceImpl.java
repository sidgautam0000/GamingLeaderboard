package com.gaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaming.entities.Teams;
import com.gaming.repository.TeamsRepo;

@Service
public class TeamsServiceImpl implements TeamsService{

	@Autowired
	TeamsRepo trepo;
	
	@Override
	public Teams createTeam(Teams team) {
		return trepo.save(team);
		
	}

	@Override
	public Optional<Teams> getTeamById(int id) {		
		return trepo.findById(id);
	}

	@Override
	public void updateTeam(Teams team) {
		trepo.save(team);
		
	}

	@Override
	public void deleteTeam(int id) {
		trepo.deleteById(id);
		
	}

	//@Override
//	public void addUserToTeam(int uid, int tid) {
////		trepo.
//		
//	}

	@Override
	public List<Teams> getAllTeams() {
		
		return trepo.findAll();
	}

}
