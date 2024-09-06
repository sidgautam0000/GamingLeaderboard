package com.gaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaming.entities.Game;
import com.gaming.repository.GameRepo;

@Service
public class GameServiceImpl implements GameService{

	@Autowired
	GameRepo  grepo;
	
	@Override
	public Game createGame(Game game) {
		
		return grepo.save(game);
	}
	@Override
	public Game updateGame(Game game) {
		return grepo.save(game);
	}
	@Override
	public void deleteGame(int gid) {
		grepo.deleteById(gid);
		
	}
	@Override
	public Optional<Game> getGameById(int gid) {
		return grepo.findById(gid);
	}
	@Override
	public List<Game> getAllGames() {
		return grepo.findAll();
	}
	@Override
	public List<Game> getGameByName(String gname) {
		return grepo.findByNameContainingIgnoreCase(gname);
	}

}
