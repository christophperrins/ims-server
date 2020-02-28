package com.qa.ims.dto.order;

import java.util.List;

import com.qa.ims.model.Item;

public class OrderDtoWithId {

	private Long id;
	private List<Item> items;
	private boolean purchased = false;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public boolean isPurchased() {
		return purchased;
	}

	public void setPurchased(boolean purchased) {
		this.purchased = purchased;
	}

	
	
}
