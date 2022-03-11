package com.qa.strings;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Words {
	
	public String[] wordCount(String string) {
		String[] splitWord = string.split(" ");
		System.out.println(splitWord.length);
		return splitWord;
	}
	
	
	public void vertWord(String word) {
		String[] splitWord = wordCount(word);
		for (int i = 0; i < splitWord.length; i++) {
			System.out.println(splitWord[i] + "\n");
		}
	}
	
	public void revertWord(String word) {
		String[] splitWord = wordCount(word);
		List<String> revWord = Arrays.asList(splitWord);
		Collections.reverse(revWord);
		for (int i = 0; i < revWord.size(); i++) {
		System.out.println(revWord.toArray()[i] + "\n");
		}
		
	}
}
