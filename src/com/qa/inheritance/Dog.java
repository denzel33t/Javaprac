package com.qa.inheritance;

public class Dog extends Animal {

	private boolean isPanting;
	private String breed;
	
	public Dog(int age, int numOfLegs, String colour, boolean isPanting, String breed) {
		super(age, numOfLegs, colour);
		this.isPanting = isPanting;
		this.breed = breed;
	}

	public boolean isPanting() {
		return isPanting;
	}

	public void setPanting(boolean isPanting) {
		this.isPanting = isPanting;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public void makeSound() {
		System.out.println("WOOF!");
	}
	
}
