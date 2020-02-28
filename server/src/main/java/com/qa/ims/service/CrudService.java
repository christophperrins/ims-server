package com.qa.ims.service;

import java.util.List;

public interface CrudService<T> {

	public T find(Long id);
	
	public List<T> findAll();
	
	public T create(T t);
	
	public T update(T t);
	
	public void delete(Long id);
}
