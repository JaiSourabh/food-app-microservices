package com.yash.item.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="item")
@Data
public class Item {
	
	@Id
	@Column(name="itemid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemId;
	
	@Column(name = "itemname")
	private String itemName;
	
	@Column(name="itemprice")
	private double itemPrice;
	
	@JoinColumn(name = "category_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Category category;
}
