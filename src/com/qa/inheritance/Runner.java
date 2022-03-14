package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {
		
		Garage vehicleCollection = new Garage("multipurpose");
		
		Yacht yacht = new Yacht(10, 0, "N/A", true, 6, "The Stamford", 320);
		Car car = new Car(4, 4, "YV4X HDO", "Ford", "Hatchback", 2);
		Motorbike motorbike = new Motorbike(1, 2, "S4MURA1", "Yamaha", 500);
		
		vehicleCollection.addToGarage(yacht);
		vehicleCollection.addToGarage(car);
		vehicleCollection.addToGarage(motorbike);
		
		
		
		
		

	}

}
