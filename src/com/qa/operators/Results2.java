package com.qa.operators;

public class Results2 {
	
	public int physics_score;
	public int chemistry_score;
	public int biology_score;
	public int total_mark;
	public int percentage;
	
	public Results2(int physics_score, int chemistry_score, int biology_score) {
		this.physics_score = physics_score;
		this.chemistry_score = chemistry_score;
		this.biology_score = biology_score;
		this.total_mark = physics_score + chemistry_score + biology_score;
	}
	
	public void scores() {
		System.out.println("-------------\nYour Results:\n-------------");
		System.out.println("Physics:	" + this.physics_score);
		System.out.println("Chemistry:	" + this.chemistry_score);
		System.out.println("Biology:	" + this.biology_score);
		System.out.println("Total:		" + this.total_mark);
	}
	
}
