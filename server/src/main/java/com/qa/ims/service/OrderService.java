package com.qa.ims.service;

import java.util.List;

import com.qa.ims.model.Item;
import com.qa.ims.model.ItemHistory;
import com.qa.ims.model.PurchaseOrder;

public interface OrderService {

	public PurchaseOrder find(long orderId);
	
	public List<PurchaseOrder> findAll();
	
	public PurchaseOrder create();
	
	public PurchaseOrder update(PurchaseOrder order);
	
	public PurchaseOrder addItemToOrder(long orderId, ItemHistory item);
	
	public PurchaseOrder deleteItemFromOrder(long orderId, ItemHistory item);
	
	public void delete(long orderId);
	
}
