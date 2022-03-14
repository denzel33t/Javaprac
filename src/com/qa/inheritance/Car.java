package com.qa.inheritance;

public class Car extends Vehicle {
	
	private String manufacturer;
	private String type;
	private int engineCapacity;
	
	public Car(int numOfSeats, int wheels, String licencePlate, String manufacturer, String type, int engineCapacity) {
		super(numOfSeats, wheels, licencePlate);
		this.manufacturer = manufacturer;
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getEngineCapacity() {
		return engineCapacity;
	}
	
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	public boolean hasStorageSpace() {
		return true;
	}

	@Override
	public String toString() {
		return "Car [manufacturer=" + manufacturer + ", type=" + type + ", engineCapacity=" + engineCapacity + "]";
	}


}
