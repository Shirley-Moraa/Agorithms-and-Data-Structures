package com.treesNGraphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DataStructures {
	

	
	public static void main(String[] args) {
		 //Linkedlist
			
		  //Stacks
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		System.out.println(stack.peek());
		
			
		  //Queue
		
		
		 //HashMap
		HashMap<String, Integer> people = new HashMap<>();
		people.put("Shirley", 25);
		people.put("Jeff", 30);
		people.put("Brian", 33);
		people.put("Val", 35);
		
		// loop through
		for(String i : people.keySet()) {
//			if(i == "Shirley") {
//				people.remove("Shirley");
//			}
			System.out.println( i + ", has an age of " + people.get(i));
		}
			
		  //Arraylist
		ArrayList<chef> cooks = new ArrayList<>();
		chef one = new chef("Alan", 32);
		chef two = new chef("Rose", 32);
		chef three = new chef("Josy", 32);
		
		
		cooks.add(one);
		cooks.add(two);
		cooks.add(three);
		
		System.out.println(cooks.get(0).name);
		
		
		
			
		
	}
}

class chef{
	String name;
	int age;
	
	// constructor
	public chef(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}




