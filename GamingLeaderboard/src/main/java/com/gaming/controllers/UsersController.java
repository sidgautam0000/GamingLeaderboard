package com.gaming.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaming.entities.Score;
import com.gaming.entities.Users;
import com.gaming.service.UserService;
import com.gaming.service.UserServiceImpl;

@RestController
public class UsersController{
	
	@Autowired
	UserService userv;
	
	@GetMapping("/") 
    public String hello() {
        return "Hello World!";
    }
	
	@PostMapping("/user")
	private void saveUsers(@RequestBody Users users) {
		userv.createUser(users);
	}

	//Optional<Users> getUserById(int id);
	@GetMapping("/user/{id}")
	private Optional<Users> getUsers(@PathVariable("id") int uid) {
		return userv.getUserById(uid);
	}
	
	//	void updateUser(Users user,int id);
	@PutMapping("/user")
	private void updateUsers(@RequestBody Users user) {
		userv.updateUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	private void deleteUsers(@PathVariable("id")int uid) {
		userv.deleteUser(uid);
	}
	
	@GetMapping("/users/{tid}")
	private ResponseEntity<List<Users>> getUsersByTeam(@PathVariable("tid") int tid){
		return ResponseEntity.ok(userv.getUsersByTeam(tid));
	}
	
	@GetMapping("/userall")
	private List<Users> getAllTeams(){
		return userv.getAllUsers();
	}
	
	@GetMapping("/usersscor/{id}")
	private List<Score> getScoreByUser(@PathVariable ("id")int id){
		return userv.getScoreByUser(id);
	}
	
	
	
	@Autowired
	UserServiceImpl usimp;
	//security
	
//	@GetMapping("/secure-endpoint")
//    public ResponseEntity<String> getSecureData() {
//        return ResponseEntity.ok("This is secure data");
//    }
//	
//	@PostMapping("/register")
//    public ResponseEntity<String> userRegister(@RequestBody Users user) {
//        if (usimp.saveUser(user) != null) {
//            return new ResponseEntity<>("User Registered Successfully", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Oops! User not registered", HttpStatus.OK);
//        }
//    }
}
