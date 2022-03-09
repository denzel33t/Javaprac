package com.qa.operators;

public class Results {
	public void examResults(int physics_score, int chemistry_score, int biology_score) {
		System.out.println("Physics Score: " + physics_score + "\n");
		System.out.println("Chemistry Score: " + chemistry_score + "\n");
		System.out.println("Biology Score: " + biology_score + "\n");
		System.out.println("Total Mark: " + (physics_score + chemistry_score + biology_score) + "/" + "450" + "\n");
	}
	
	public void examPerc(int physics_score, int chemistry_score, int biology_score) {
		System.out.println("Percentage: " + (float)(physics_score+chemistry_score+biology_score)/450 * 100 + "%");
	}
	
}