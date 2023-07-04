package com.wilson.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wilson.dev.model.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
