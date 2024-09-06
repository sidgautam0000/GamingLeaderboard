package com.gaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gaming.entities.Score;

@Service
public interface ScoreService {
	Score createScore(Score score); 

	Optional<Score> getScoreById(int id);

	void updateScore(Score score);

	void deleteScore(int id);

	List<Score> getAllScore();

	public List<Score> getScoreByUserId(int userId);

}
