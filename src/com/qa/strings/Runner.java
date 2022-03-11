package com.qa.strings;

public class Runner {

	public static void main(String[] args) {
		String yesterDay = "yesterday it was raining";
		String toDay = "today it is sunny";
		
		String senTence = toDay.toUpperCase().concat(" "+ yesterDay.toUpperCase());
//		
//		System.out.println(senTence);
//		System.out.println(senTence.substring(0, 18));
		
		Words myWords = new Words();
//		
//		myWords.wordCount(senTence);
//		
//		myWords.vertWord(senTence);
//		
		myWords.revertWord(senTence);

	}

}
