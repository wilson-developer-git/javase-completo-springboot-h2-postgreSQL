package com.wilson.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilson.dev.model.User;
import com.wilson.dev.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long userId){
		return userRepository.findById(userId).get();
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
}
