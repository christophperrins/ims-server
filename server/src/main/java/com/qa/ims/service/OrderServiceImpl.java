package com.qa.ims.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.ims.exceptions.NotFoundException;
import com.qa.ims.model.ItemHistory;
import com.qa.ims.model.PurchaseOrder;
import com.qa.ims.persistence.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	private OrderRepository orderRepository;
	
	public OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public PurchaseOrder find(long orderId) {
		return orderRepository.findById(orderId).orElseThrow(() -> new NotFoundException("Order not found"));
	}

	@Override
	public List<PurchaseOrder> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public PurchaseOrder create() {
		PurchaseOrder order = new PurchaseOrder();
		return orderRepository.saveAndFlush(order);
	}

	@Override
	public PurchaseOrder update(PurchaseOrder order) {
		return orderRepository.saveAndFlush(order);
	}

	@Override
	public PurchaseOrder addItemToOrder(long orderId, ItemHistory item) {
		PurchaseOrder order = find(orderId);
		List<ItemHistory> items = order.getItems();
		items.add(item);
		order.setItems(items);
		return update(order);
	}

	@Override
	public PurchaseOrder deleteItemFromOrder(long orderId, ItemHistory item) {
		PurchaseOrder order = find(orderId);
		List<ItemHistory> orders = order.getItems();
		for (ItemHistory itemInDb : orders) {
			if (itemInDb.getId() == item.getId()) {
				orders.remove(itemInDb);
				break;
			}
		}
		order.setItems(orders);
		return update(order);
	}

	@Override
	public void delete(long orderId) {
		find(orderId);
		orderRepository.deleteById(orderId);
	}

}
