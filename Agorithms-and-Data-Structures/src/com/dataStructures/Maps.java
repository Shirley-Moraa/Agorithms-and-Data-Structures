package com.dataStructures;

import java.util.HashMap;
// create a list of 5 students with their name and positions
// add 2 new students to the list
// remove the students with who are in the even postions
// display the top most student, index 1
// remove the last student
public class Maps {

// create the main class
	public static void main(String[] args) {
   
	HashMap<Integer, String> people = new HashMap<>();
	
	// add 5 people to our list
	people.put(1,"Ben");
	people.put(2, "Adam");
	people.put(3, "Rono");
	people.put(4, "Georggy");
	people.put(5, "Dan");
	
	people.put(6, "Phil");
	people.put(7, "John Doe");
	
	// print out the list of crushes and the people I loved dearly
	//System.out.println(people);
	for(Integer i : people.keySet()) {
		if((i/2)==0) {
			// only remove people in the even positions
			//people.remove(i);
		}
	}
	
	System.out.println(people);
	
	for(Integer i : people.keySet()) {
		if((i%2 == 0 )) {
			System.out.println(people.get(i));
		}else {
			System.out.println("Not even");
		}
		
	}
	
		
	}
}
