package com.qa.ims.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qa.ims.dto.item.ItemDto;
import com.qa.ims.dto.item.ItemWithIdDto;

public interface ItemController {

	@RequestMapping(path = "/item/{id}", method = {RequestMethod.GET})
	public ItemWithIdDto get(@PathVariable("id") Long id);
	
	@RequestMapping(path = "/item/all", method = {RequestMethod.GET})
	public List<ItemWithIdDto> getAll();
	
	@RequestMapping(path = "/item", method = {RequestMethod.POST})
	public ItemWithIdDto create(@RequestBody ItemDto item);
	
	@RequestMapping(path = "/item", method = {RequestMethod.PUT})
	public ItemWithIdDto update(@RequestBody ItemWithIdDto item);
	
	@RequestMapping(path = "/item/{id}", method = {RequestMethod.DELETE})
	public void deleteItem(@PathVariable("id") Long id);
}
