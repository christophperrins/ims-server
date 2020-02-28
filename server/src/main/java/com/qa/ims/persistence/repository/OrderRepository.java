package com.qa.ims.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.ims.model.PurchaseOrder;

public interface OrderRepository extends JpaRepository<PurchaseOrder, Long>{

}
