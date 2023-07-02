package com.wilson.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wilson.dev.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
