package com.qa.enacpsulation;

public class Runner {

	public static void main(String[] args) {
		
		Person denzel = new Person("denzel",22,"SWE");
		Person mat = new Person("mat",24,"SWE");
		Person badul = new Person("badul",25,"SWE");
		
		System.out.println(denzel.getAge());
		System.out.println(badul.getJobTitle());
		System.out.println(mat.getName());
		
		FriendsList friends = new FriendsList();
		friends.addToList(badul);
		friends.addToList(denzel);
		friends.addToList(mat);
		

	}

}
