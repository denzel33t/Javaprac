package com.qa.arrays;

public class Runner {

	public static void main(String[] args) {
		
		int[] finalArray = new int[10];
//		int[] emptyArray = {};
		
		for(int i = 0; i < finalArray.length; i++) {
			finalArray[i] = i + 1;		
			System.out.println(finalArray[i]);
		}
		System.out.println();
		
		for (int i = 0; i < finalArray.length; i++) {
			finalArray[i]= finalArray[i] * 10;
			System.out.println(finalArray[i]);
		}
			
//	}	for (int i = 0; i < emptyArray[i]; i++) {
//			int addCount = 0;
//			int x 
//			
	}
//
}
