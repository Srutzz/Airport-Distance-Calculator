package com.flight.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FlightEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String IATACode;
	private double lattitude;
	private double longitude;

	public FlightEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getIATACode() {
		return IATACode;
	}
	public void setIATACode(String iATACode) {
		IATACode = iATACode;
	}
	public double getLattitude() {
		return lattitude;
	}
	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public FlightEntity(String name, String iATACode, double lattitude, double longitude, double altitude) {
		super();
		this.name = name;
		IATACode = iATACode;
		this.lattitude = lattitude;
		this.longitude = longitude;
		//this.sr = sr;
	}
	
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + ", IATACode=" + IATACode + ", lattitude=" + lattitude
				+ ", longitude=" + longitude + "]";
	}
	
}
