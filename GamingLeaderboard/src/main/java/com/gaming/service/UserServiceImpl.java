package com.gaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.gaming.entities.Score;
//import com.gaming.entities.UserPrincipal;
import com.gaming.entities.Users;
import com.gaming.exceptions.InvalidUserIdException;
import com.gaming.repository.UserRepo;
//,UserDetailsService
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo urepo;
	
	
	//security
//	private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
//
//    public Users saveUser(Users user) {
//        user.setPassword(encoder.encode(user.getPassword()));
//        return urepo.save(user);
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Users user = urepo.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("user not found");
//        } else {
//            return new UserPrincipal(user);
//        }
//    }
	//security
	
	
	@Override
	public void createUser(Users user) {
		urepo.save(user);
		
	}

	@Override
	public Optional<Users> getUserById(int id){		
		Optional<Users> ur=urepo.findById(id);
		return ur;
	}

//	public void changeDomain(int employeeId, String domain) throws InvalidEngineerIdException, InvalidDomainException {
//
//		Optional<Engineer> id = erepo.findById(employeeId);
//		if (id.isPresent()) {
//			id.get().setDomain(domain);
//		}
//
//		else {
//			throw new InvalidEngineerIdException("Engineer Id doesn't exist");
//		}
//
//	}
	@Override
	public void updateUser(Users user) {
		urepo.save(user);
		
	}

	@Override
	public void deleteUser(int id) {
		urepo.deleteById(id);
		
	}

	@Override
	public List<Users> getUsersByTeam(int tid) {
		return urepo.findByTeamTid(tid);
		//List<Integer> u=new ArrayList<Integer>();
//		List<Integer> uids=urepo.
//		
//		return u;
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}

	@Override
	public List<Score> getScoreByUser(int id) {
		Users user=urepo.findById(id).orElseThrow(()->new RuntimeException("user not found"+id));
		return user.getScores();
	}

}
