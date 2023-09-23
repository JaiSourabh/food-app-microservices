package com.yash.category.service;

import org.springframework.stereotype.Service;

import com.yash.category.model.Category;

@Service
public interface CategoryService {
	public Category createCategory(Category category);
}
