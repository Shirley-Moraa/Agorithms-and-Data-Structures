package com.dataStructures;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // create an Arraylist and add CRUD functionalities
		ArrayList<String> arr = new ArrayList<String>();
		
		// add elements
		arr.add("one");
		arr.add("two");
		arr.add("three");
		
		System.out.print(arr);
		int size = arr.size();
		
		// remove element
		arr.remove("one");
		System.out.print(arr);
		
		
		for(int i = 0 ; i < arr.size(); i++){
		    System.out.println(arr.get(i));
		}
  
		
	}

}
