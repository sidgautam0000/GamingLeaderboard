package com.gaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gaming.entities.Score;
import com.gaming.entities.Users;
import com.gaming.exceptions.InvalidUserIdException;

@Service
public interface UserService {

	void createUser(Users user);
	
	Optional<Users> getUserById(int id);
	
	void updateUser(Users user);
	
	void deleteUser(int id);
	
	List<Users> getUsersByTeam(int tid);

	List<Users> getAllUsers();

	List<Score> getScoreByUser(int id);
	
}
