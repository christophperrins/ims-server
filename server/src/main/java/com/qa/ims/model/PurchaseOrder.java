package com.qa.ims.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PurchaseOrder {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToMany
	private List<ItemHistory> items;
	
	private boolean purchased = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemHistory> getItems() {
		return items;
	}

	public void setItems(List<ItemHistory> items) {
		this.items = items;
	}

	public boolean isPurchased() {
		return purchased;
	}

	public void setPurchased(boolean purchased) {
		this.purchased = purchased;
	}

	
}
