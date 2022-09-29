package day4.dbconnection.service;

public interface ServiceInterface<T> {
	void getAll();
	void insert(T obj);

}
