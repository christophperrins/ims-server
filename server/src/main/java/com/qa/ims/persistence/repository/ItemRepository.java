package com.qa.ims.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.ims.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
