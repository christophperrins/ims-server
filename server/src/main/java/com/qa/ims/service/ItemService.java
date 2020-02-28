package com.qa.ims.service;

import java.util.List;

import com.qa.ims.model.Item;

public interface ItemService {

	public Item find(Long id);
	
	public List<Item> findAll();
	
	public Item create(Item item);
	
	public Item update(Item item);
	
	public void delete(Long id);
}
