package io;

import java.util.ArrayList;

public class IORunner {

	
	public static void main(String[] args) {
		// edit as necessary
		//testPeople();
		People peop1 = new People();
		ArrayList<Person> coolpeps = peop1.readFile();
		System.out.print("Total people " + coolpeps.size());
		
	}
	

	
	
	public static void testPeople() {
		// fill in as necessary		
	}
	
	

	
	
}
