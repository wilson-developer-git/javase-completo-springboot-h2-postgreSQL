package com.wilson.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilson.dev.model.User;
import com.wilson.dev.repository.UserRepository;
import com.wilson.dev.service.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(Long userId) {
		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException(userId));
	}

	public User insert(User user) {
		return userRepository.save(user);
	}

	public void delete(Long userId) {
		userRepository.deleteById(userId);
	}

	public User update(Long userId, User user) {
		User upUser = userRepository.getReferenceById(userId);
		updateData(upUser, user);
		return userRepository.save(upUser);
	}

	private void updateData(User upUser, User user) {
		upUser.setName(user.getName());
		upUser.setEmail(user.getEmail());
		upUser.setPhone(user.getPhone());
	}

}
