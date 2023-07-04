package com.wilson.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wilson.dev.model.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long>{

}
