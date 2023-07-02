package com.wilson.dev.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wilson.dev.model.User;
import com.wilson.dev.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "João", "joao@gmail.com", "99999999", "123456");
		User u2 = new User(null, "Maria", "maria@gmail.com", "88888888", "7891011");
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

	
	
}
