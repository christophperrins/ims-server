package com.qa.ims.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.ims.exceptions.NotFoundException;
import com.qa.ims.mapping.ImsMapping;
import com.qa.ims.model.Item;
import com.qa.ims.model.ItemHistory;
import com.qa.ims.persistence.repository.ItemHistoryRepository;
import com.qa.ims.persistence.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	private ItemRepository itemRepository;
	private ItemHistoryRepository itemHistoryRepository;
	private ImsMapping imsMapping;

	public ItemServiceImpl(ItemRepository itemRepository, ItemHistoryRepository itemHistoryRepository, ImsMapping imsMapping) {
		super();
		this.itemRepository = itemRepository;
		this.itemHistoryRepository = itemHistoryRepository;
		this.imsMapping = imsMapping;
	}

	@Override
	public Item find(Long id) {
		return itemRepository.findById(id).orElseThrow(() -> new NotFoundException("Item not found"));
	}

	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	@Override
	public Item create(Item item) {
		Item saved = itemRepository.saveAndFlush(item);
		itemHistoryRepository.saveAndFlush(imsMapping.map(saved, ItemHistory.class));
		return saved;
		
	}

	@Override
	public Item update(Item item) {
		Item saved = itemRepository.saveAndFlush(item);
		itemHistoryRepository.saveAndFlush(imsMapping.map(saved, ItemHistory.class));
		return saved;
		
	}

	@Override
	public void delete(Long id) {
		itemRepository.deleteById(id);
	}

}
