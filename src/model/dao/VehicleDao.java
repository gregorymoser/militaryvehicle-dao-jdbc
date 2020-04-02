package model.dao;

import java.util.List;

import model.entities.Vehicle;

public interface VehicleDao {

	void insert (Vehicle obj);
	void uodate (Vehicle obj);
	void deleteByID (Integer id);
	Vehicle fidnById (Integer id);
	List <Vehicle> findAll();
}
