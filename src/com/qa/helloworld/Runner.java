package com.qa.helloworld;

public class Runner {

	
	
	public static void main(String[] args) {
		HelloWorld myGreeting = new HelloWorld();
		String myResult = myGreeting.concatText("Hello","World");
		System.out.println(myResult);
		myGreeting.printMessage("Hi there!");
	}

}
