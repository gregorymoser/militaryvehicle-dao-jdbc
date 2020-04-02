package model.dao;

import model.dao.impl.VehicleDaoJDBC;

public class DaoFactory {
	
	public static VehicleDao createVehicleDao() {
		return new VehicleDaoJDBC();
	}
}
