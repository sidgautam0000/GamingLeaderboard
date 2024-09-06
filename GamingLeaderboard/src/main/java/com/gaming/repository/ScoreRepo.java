package com.gaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaming.entities.Score;

@Repository
public interface ScoreRepo extends JpaRepository<Score,Integer>{
	
	List<Score> findByUserid_Uid(int userId);
}
