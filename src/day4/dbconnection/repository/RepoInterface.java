package day4.dbconnection.repository;

import java.util.ArrayList;

public interface RepoInterface<T> {
	ArrayList<T> getAll();
	void insert(T obj);
}
