package com.qa.conditionals;

public class Blackjack {

	public int card_one;
	public int card_two;
	
	public Blackjack(int card_one, int card_two) {
		this.card_one = card_one;
		this.card_two = card_two;
	}
	
	public void play_game() {
		if (card_one <0 || card_two <0) {
			System.out.println("Error.");
		}
		
		if (card_one <= 21 && card_one > card_two) {
			System.out.println(card_one);
		} else {
			System.out.println("Better luck next time, player one.");
		}
		
		if (card_two <= 21 && card_two > card_one) {
			System.out.println(card_two);
		} else {
		 	System.out.println("Better luck next time, player two.");
		}
	}
}