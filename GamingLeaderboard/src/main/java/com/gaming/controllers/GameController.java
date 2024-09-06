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

import com.gaming.entities.Game;
import com.gaming.service.GameService;

@RestController
public class GameController {

	@Autowired
	GameService gserve;
	
	@PostMapping("/game")
	private Game saveGame(@RequestBody Game game) {
		return gserve.createGame(game);
		
	}
	
	@GetMapping("/game/{id}")
	private Optional<Game> getGameById(@PathVariable ("id") int id) {
		return gserve.getGameById(id);
	}
	
	@PutMapping("/game")
	private Game updateGame(@RequestBody Game game) {
		return gserve.updateGame(game);
	}
	
	@DeleteMapping("/game/{id}")
	private void deleteGame(@PathVariable("id") int id) {
		gserve.deleteGame(id);
	}
	
	@GetMapping("/games")
	private List<Game> allGames(){
		return gserve.getAllGames();
	}
	
	@GetMapping("/games/{gname}")
	private List<Game> findByName(@PathVariable("gname") String gname){
		return gserve.getGameByName(gname);
	}
}
