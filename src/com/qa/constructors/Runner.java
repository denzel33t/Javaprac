package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {
		Person denzel = new Person("Denzel",22,11);
		System.out.println("Name: " + denzel.name);
		System.out.println("Age " + denzel.age);
		System.out.println("Shoe Size: " + denzel.shoeSize + "\n");
		
		Person raine = new Person ("Raine",22,5);
		System.out.println("Name: " + raine.name);
		System.out.println("Age " + raine.age);
		System.out.println("Shoe Size: " + raine.shoeSize +"\n");
		
		
	}

}
