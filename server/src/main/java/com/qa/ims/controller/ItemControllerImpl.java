package com.qa.ims.controller;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.qa.ims.dto.item.ItemDto;
import com.qa.ims.dto.item.ItemWithIdDto;
import com.qa.ims.mapping.ImsMapping;
import com.qa.ims.model.Item;
import com.qa.ims.service.CrudService;
import com.qa.ims.service.ItemService;

@RestController
@CrossOrigin("*")
public class ItemControllerImpl implements ItemController{
	
	private ItemService service;
	private ImsMapping imsMapping;

	public ItemControllerImpl(ItemService service, ImsMapping imsMapping) {
		super();
		this.service = service;
		this.imsMapping = imsMapping;
	}

	@Override
	public ItemWithIdDto get(Long id) {
		return imsMapping.map(service.find(id), ItemWithIdDto.class);
	}

	@Override
	public List<ItemWithIdDto> getAll() {
		return imsMapping.mapList(service.findAll(), ItemWithIdDto.class);
	}

	@Override
	public ItemWithIdDto create(ItemDto itemDto) {
		Item item = imsMapping.map(itemDto, Item.class);
		return imsMapping.map(service.create(item), ItemWithIdDto.class);
	}

	@Override
	public ItemWithIdDto update(ItemWithIdDto itemDto) {
		Item item = imsMapping.map(itemDto, Item.class);
		return imsMapping.map(service.update(item), ItemWithIdDto.class);
	}

	@Override
	public void deleteItem(Long id) {
		service.delete(id);
	}

	
	
}
