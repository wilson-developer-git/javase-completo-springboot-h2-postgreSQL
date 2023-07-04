package com.wilson.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilson.dev.model.Category;
import com.wilson.dev.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = categoryService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/id/{categoryId}")
	public ResponseEntity<Category> findById(@PathVariable Long categoryId){
		Category category = categoryService.findById(categoryId);
		return ResponseEntity.ok().body(category);
	}
}
