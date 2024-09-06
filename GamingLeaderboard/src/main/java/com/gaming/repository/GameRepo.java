package com.gaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaming.entities.Game;
import com.gaming.entities.Users;
@Repository
public interface GameRepo extends JpaRepository<Game,Integer>{

	List<Game> findByNameContainingIgnoreCase(String name);


}
