package com.yash.category.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="category")
@Data
public class Category {
	
	@Id
	@Column(name="category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@Column(name = "category_desc")
	private String categoryDesc;
	
}
