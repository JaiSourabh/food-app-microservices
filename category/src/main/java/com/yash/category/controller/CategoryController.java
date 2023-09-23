package com.yash.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.category.model.Category;
import com.yash.category.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/category")
@Slf4j
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	
		@PostMapping("/createcategory")
		public Category createCategory(@RequestBody Category category) {
			log.info("Inside createCategory()");
			return categoryService.createCategory(category);
		}
	
}
