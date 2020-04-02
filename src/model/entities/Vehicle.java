package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Vehicle implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String chassis;
	private Date firstDate;
	private Double odometer;
	
	private Company company;
	
	public Vehicle() {
		
	}

	public Vehicle(Integer id, String name, String chassis, Date firstDate, Double odometer, Company company) {
		super();
		this.id = id;
		this.name = name;
		this.chassis = chassis;
		this.firstDate = firstDate;
		this.odometer = odometer;
		this.company = company;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public Date getFirstDate() {
		return firstDate;
	}

	public void setFirstDate(Date firstDate) {
		this.firstDate = firstDate;
	}

	public Double getOdometer() {
		return odometer;
	}

	public void setOdometer(Double odometer) {
		this.odometer = odometer;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", chassis=" + chassis + ", firstDate=" + firstDate
				+ ", odometer=" + odometer + ", company=" + company + "]";
	}
}
