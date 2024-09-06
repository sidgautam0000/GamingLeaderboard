package com.gaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaming.entities.Score;
import com.gaming.repository.ScoreRepo;

@Service
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	ScoreRepo srepo;

	@Override
	public Score createScore(Score score) {
		return srepo.save(score);
	}

	@Override
	public Optional<Score> getScoreById(int id) {
		Optional<Score> score = srepo.findById(id);
		return score;
	}

	@Override
	public void updateScore(Score score) {
		srepo.save(score);

	}

	@Override
	public void deleteScore(int id) {
		srepo.deleteById(id);

	}

	@Override
	public List<Score> getAllScore() {
		return srepo.findAll();
	}

	@Override
	public List<Score> getScoreByUserId(int userId) {
		return srepo.findByUserid_Uid(userId);
	}

}
