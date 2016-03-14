package com.bpodesign.core.interfaces.repositories;

import java.util.List;

public interface IRepositoryBase <T>{
	public T Save(T entity);
	public T Update(T entity);
	public T Delete(T entity);
	public T getById(Long id);
	public List<T>getAll();
}
