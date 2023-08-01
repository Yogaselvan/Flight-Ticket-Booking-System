package service;

import model.Service;

public interface Manageble<T> {
	void add(T entity);
    void update(T entity);
    void delete(int id);
    T getById(int id);
	void update(int serviceId, Service service);
}

