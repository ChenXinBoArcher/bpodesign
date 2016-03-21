package com.bpodesign.core.interfaces.repositories;

import java.util.List;

public interface IRepositoryBase <T>{
	public T save(T entity);
	public T update(T entity);
	public T delete(T entity);
	public T getById(Long id);
	public List<T>getAll();
}
