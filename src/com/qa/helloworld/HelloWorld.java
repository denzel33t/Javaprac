package com.qa.helloworld;

public class HelloWorld {
	//accessmodifier ReturnType
	public static void helloWorld() {
		String helloWorld = "Hello World.";
		System.out.println(helloWorld);
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	
	
	// entry point for program execution
	public static void main(String[] args) {
	helloWorld();	
	System.out.println("It is me again.");
	printMessage("SIUUUUUUU");
	}
}
