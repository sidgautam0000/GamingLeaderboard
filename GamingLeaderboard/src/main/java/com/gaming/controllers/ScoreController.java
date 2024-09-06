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

import com.gaming.entities.Score;
import com.gaming.service.ScoreService;

@RestController
public class ScoreController {

	@Autowired
	ScoreService scorev;

	@PostMapping("/scores")
	private Score createScore(@RequestBody Score score) {
		scorev.createScore(score);
		return score;
	}

	@GetMapping("/scores/{id}")
	private Optional<Score> getScoreById(@PathVariable("id") int id) {
		return scorev.getScoreById(id);

	}

	@PutMapping("/scores")
	private void updateScore(Score score) {
		scorev.updateScore(score);
	}

	@DeleteMapping("/scores/{id}")
	private void deleteScore(@PathVariable("id") int id) {
		scorev.deleteScore(id);
	}

	@GetMapping("/score")
	private List<Score> getAllScore() {
		return scorev.getAllScore();

	}
	
	@GetMapping("/score/{id}")
	private List<Score> getScoresByUserId(@PathVariable("id") int id){
		return scorev.getScoreByUserId(id);
	}

}
