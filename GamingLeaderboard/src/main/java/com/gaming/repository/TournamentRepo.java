package com.gaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaming.entities.Tournament;

@Repository
public interface TournamentRepo extends JpaRepository<Tournament,Integer>{

	List<Tournament> findByStatusContainingIgnoreCase(String status);

	List<Tournament> findByTeams_Tid(int tid);
}
