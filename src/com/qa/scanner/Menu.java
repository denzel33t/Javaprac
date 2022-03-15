package com.qa.scanner;
import java.util.Scanner;

public class Menu {

	public void start() {
		Scanner calcinput = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.println("Select a method:");
		String methodSelect = calcinput.nextLine();
		
		
		if (methodSelect.equalsIgnoreCase("addition")) {
			System.out.println("Enter a number: ");
			Double numOne = calcinput.nextDouble();
			calcinput.nextLine();
			System.out.println("Enter another number: ");
			Double numTwo = calcinput.nextDouble();
			System.out.println(calculator.addition(numOne, numTwo));
			
		}else if (methodSelect.equalsIgnoreCase("subtraction")){
			System.out.println("Enter a number: ");
			Double numOne = calcinput.nextDouble();
			calcinput.nextLine();
			System.out.println("Enter another number: ");
			Double numTwo = calcinput.nextDouble();
			System.out.println(calculator.subtraction(numOne, numTwo));
			
		}else if (methodSelect.equalsIgnoreCase("multiplication")) {
			System.out.println("Enter a number: ");
			Double numOne = calcinput.nextDouble();
			calcinput.nextLine();
			System.out.println("Enter another number: ");
			Double numTwo = calcinput.nextDouble();
			System.out.println(calculator.multiply(numOne, numTwo));
			
		}else if (methodSelect.equalsIgnoreCase("division")) {
			System.out.println("Enter a number: ");
			Double numOne = calcinput.nextDouble();
			calcinput.nextLine();
			System.out.println("Enter another number: ");
			Double numTwo = calcinput.nextDouble();
			System.out.println(calculator.division(numOne, numTwo));
		}
	
		calcinput.close();
		}
	}

