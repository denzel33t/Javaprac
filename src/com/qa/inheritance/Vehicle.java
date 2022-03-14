package com.qa.inheritance;

public abstract class Vehicle {

	private int numOfSeats;
	private int wheels;
	private String licencePlate;
	
	public Vehicle(int numOfSeats, int wheels, String licencePlate) {
		
		this.numOfSeats = numOfSeats;
		this.wheels = wheels;
		this.licencePlate = licencePlate;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}
	
	public abstract boolean hasStorageSpace();
	
	
}
