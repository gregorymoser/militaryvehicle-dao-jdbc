package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.VehicleDao;
import model.entities.Company;
import model.entities.Vehicle;

public class Program {
	
	public static void main (String args[]) {
	
		Company company = new Company(1, "1a Cia Fuz");
		Vehicle vehicle = new Vehicle(10, "Marrua", "1A2B3C", new Date(), 1000.0, company);
		
		VehicleDao vehicleDao = DaoFactory.createVehicleDao();
		
		System.out.println(vehicle);

	}
}
