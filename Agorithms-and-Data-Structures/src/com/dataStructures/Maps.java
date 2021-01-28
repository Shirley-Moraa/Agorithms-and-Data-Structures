package com.dataStructures;

import java.util.HashMap;

public class Maps {

	//print item function
	
	public static void printHash(HashMap<Integer, String> map) {
		for(int i : map.keySet()){
			   System.out.println("-----------------------------------");
			   System.out.println( i  + " ,value: " + map.get(i));
			}
	}
	
	public static void printHashNames(HashMap<String, Integer> map) {
		for(int i : map.values()){
			   System.out.println("-----------------------------------");
			   System.out.println( i  + " ,value: " + map.get(i));
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
	
		
		
	
      HashMap<Integer, String> map = new HashMap<>();
	  HashMap<String, Integer> map2 = new HashMap<>();
	  
	  map2.put("Hello", 1);
	  map2.put("Hello2", 2);
	  for(String i : map2.keySet()){
		     System.out.println(" getting only the values " + i);

		}
		map.put(1, "John");
		map.put(2, " Mary");
		
        map2.replace("Hello", 5);

		printHash(map);
		printHashNames(map2);
			
		map.remove(1);
		
		printHash(map);
		printHashNames(map2);

	}

}
