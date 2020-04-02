package model.dao;

import java.util.List;

import model.entities.Company;

public interface CampanyDao {
	
	void insert (Company obj);
	void uodate (Company obj);
	void deleteByID (Integer id);
	Company fidnById (Integer id);
	List <Company> findAll();
}
