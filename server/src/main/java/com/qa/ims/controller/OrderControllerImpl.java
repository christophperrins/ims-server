package com.qa.ims.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.qa.ims.dto.order.OrderDtoWithId;
import com.qa.ims.dto.order.Payment;
import com.qa.ims.mapping.ImsMapping;
import com.qa.ims.model.Item;
import com.qa.ims.model.ItemHistory;
import com.qa.ims.model.PurchaseOrder;
import com.qa.ims.service.ItemService;
import com.qa.ims.service.OrderService;
import com.qa.ims.service.PaymentService;

@RestController
@CrossOrigin("*")
public class OrderControllerImpl implements OrderController{

	private OrderService orderService;
	private ItemService itemService;
	private PaymentService paymentService;
	private ImsMapping imsMapping;
	
	public OrderControllerImpl(OrderService orderService, ItemService itemService, PaymentService paymentService, ImsMapping imsMapping) {
		this.orderService = orderService;
		this.itemService = itemService;
		this.paymentService = paymentService;
		this.imsMapping = imsMapping;
	}

	public OrderDtoWithId get(long orderId) {
		return imsMapping.map(orderService.find(orderId), OrderDtoWithId.class);
	}

	@Override
	public List<OrderDtoWithId> getAll() {
		return imsMapping.mapList(orderService.findAll(), OrderDtoWithId.class);
	}

	@Override
	public OrderDtoWithId create() {
		return imsMapping.map(orderService.create(), OrderDtoWithId.class);
	}

	@Override
	public OrderDtoWithId addItemToPurchase(long orderId, long itemId) {
		ItemHistory item = imsMapping.map(itemService.find(itemId), ItemHistory.class);
		return imsMapping.map(orderService.addItemToOrder(orderId, item), OrderDtoWithId.class);
	}

	@Override
	public OrderDtoWithId deleteItemFromPurchase(long orderId, long itemId) {
		ItemHistory item = imsMapping.map(itemService.find(itemId), ItemHistory.class);
		return imsMapping.map(orderService.deleteItemFromOrder(orderId, item), OrderDtoWithId.class);
	}

	@Override
	public OrderDtoWithId payment(long orderId, Payment payment) {
		PurchaseOrder order = orderService.find(orderId);
		order.setPurchased(paymentService.processPayment(payment));
		return imsMapping.map(orderService.update(order), OrderDtoWithId.class);
	}

	@Override
	public void delete(long orderId) {
		orderService.delete(orderId);
		
	}


}
