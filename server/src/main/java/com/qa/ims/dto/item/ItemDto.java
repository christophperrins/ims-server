package com.qa.ims.dto.item;

public class ItemDto {

	private String name;
	private Double price;
	private String imageUrl;
	
	public ItemDto() {
		
	}
	
	public ItemDto(String name, Double price, String imageUrl) {
		super();
		this.name = name;
		this.price = price;
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
		
}
