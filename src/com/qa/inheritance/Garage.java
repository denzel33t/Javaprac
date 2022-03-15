package com.qa.inheritance;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private String garageType;
	
	public Garage(String garageType) {
		this.garageType = garageType;
	}


	public String getGarageType() {
		return garageType;
	}

	public void setGarageType(String garageType) {
		this.garageType = garageType;
	}

	@Override
	public String toString() {
		return "Garage [garageType=" + garageType + "]";
	}
	
	List<Vehicle> vehicleCollection = new ArrayList <>();
	
	public void addToGarage(Vehicle vehicle) {
		vehicleCollection.add(vehicle);
	}
	
	

	
}
