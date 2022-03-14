package com.qa.inheritance;

public class Motorbike extends Vehicle {
	
	private String manufacturer;
	private int cubicCapacity;
	
	public Motorbike(int numOfSeats, int wheels, String licencePlate, String manufacturer, int cubicCapacity) {
		super(numOfSeats, wheels, licencePlate);
		this.manufacturer = manufacturer;
		this.cubicCapacity = cubicCapacity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	
	public boolean hasStorageSpace() {
		return false;
	}

	@Override
	public String toString() {
		return "Motorbike [manufacturer=" + manufacturer + ", cubicCapacity=" + cubicCapacity + "]";
	}
	
	

}
