package com.qa.ims.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.ims.model.ItemHistory;

public interface ItemHistoryRepository extends JpaRepository<ItemHistory, Long>{

}
