package com.yash.category.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.category.model.Category;
import com.yash.category.repository.CategoryRepository;
import com.yash.category.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category createCategory(Category category) {
		log.info("Inside createCategory(),category : {}",category);
		Category newCategory = new Category();
		try {
			if(category!=null) {
				newCategory=categoryRepository.save(category);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return newCategory;
	}


}
