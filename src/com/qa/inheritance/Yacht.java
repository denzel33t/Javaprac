package com.qa.inheritance;

public class Yacht extends Vehicle {
	
	private boolean hasPool;
	private int numberOfRooms;
	private String boatName;
	private int topSpeed;
	
	public Yacht(int numOfSeats, int wheels, String licencePlate, boolean hasPool, int numberOfRooms, String boatName,
			int topSpeed) {
		super(numOfSeats, wheels, licencePlate);
		this.hasPool = hasPool;
		this.numberOfRooms = numberOfRooms;
		this.boatName = boatName;
		this.topSpeed = topSpeed;
	}

	public boolean isHasPool() {
		return hasPool;
	}

	public void setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getBoatName() {
		return boatName;
	}

	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public boolean hasStorageSpace() {
		return true;
	}

	@Override
	public String toString() {
		return "Yacht [hasPool=" + hasPool + ", numberOfRooms=" + numberOfRooms + ", boatName=" + boatName
				+ ", topSpeed=" + topSpeed + "]";
	}
	
	

}
