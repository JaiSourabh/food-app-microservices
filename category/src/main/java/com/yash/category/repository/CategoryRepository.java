package com.yash.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.category.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
