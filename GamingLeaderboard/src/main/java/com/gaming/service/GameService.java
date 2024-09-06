package com.gaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gaming.entities.Game;

@Service
public interface GameService {

	Game createGame(Game game);
	
	Game updateGame(Game game);
	
	void deleteGame(int gid);
	
	Optional<Game> getGameById(int gid);
	
	List<Game> getAllGames();
	
	List<Game> getGameByName(String gname);
}
