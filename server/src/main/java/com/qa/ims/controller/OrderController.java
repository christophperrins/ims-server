package com.qa.ims.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qa.ims.dto.order.OrderDtoWithId;
import com.qa.ims.dto.order.Payment;

public interface OrderController {

	@RequestMapping(path = "/order/{orderId}", method = {RequestMethod.GET})
	public OrderDtoWithId get(@PathVariable("orderId") long orderId);
	
	@RequestMapping(path = "/order/all", method = {RequestMethod.GET})
	public List<OrderDtoWithId> getAll();
	
	@RequestMapping(path = "/order", method = {RequestMethod.POST})
	public OrderDtoWithId create();
	
	@RequestMapping(path = "/order/{orderId}/item/{itemId}", method = {RequestMethod.POST})
	public OrderDtoWithId addItemToPurchase(@PathVariable("orderId") long orderId, @PathVariable("itemId") long itemId);
	
	@RequestMapping(path = "/order/{orderId}/item/{itemId}", method = {RequestMethod.DELETE})
	public OrderDtoWithId deleteItemFromPurchase(@PathVariable("orderId") long orderId, @PathVariable("itemId") long itemId);
	
	@RequestMapping(path = "/order/{orderId}", method = {RequestMethod.PATCH})
	public OrderDtoWithId payment(@PathVariable("orderId") long orderId, @RequestBody Payment payment);
	
	@RequestMapping(path = "/order/{orderId}", method = {RequestMethod.DELETE})
	public void delete(@PathVariable("orderId") long orderId);
}
