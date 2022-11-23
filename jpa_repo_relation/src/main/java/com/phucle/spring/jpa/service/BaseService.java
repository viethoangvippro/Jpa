package com.phucle.spring.jpa.service;

import java.util.List;


public interface BaseService<T> {

	public List<T> getAll();

	public void save(T object);

	public T getByID(int id);

	public void deleteById(int id) ;
}
