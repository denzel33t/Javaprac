package com.qa.conditionals;

public class Unique {
	
	public int one;
	public int two;
	public int three;
	
	public Unique(int one, int two, int three) {
		this.one = one;
		this.two = two;
		this.three = three;
	}
	
	public int uniquesum() {
		if (one != two && one != three) {
			return one + two + three;
		} else {
			return 0;
		}
		
	}
	

}
