package ArraysAndStrings;

import java.util.HashMap;

//Design an algorithm and write code to remove the duplicate characters in a string without
//using any additional buffer NOTE: One or two additional variables are fine An extra copy of the array is not
//FOLLOW UP
//Write the test cases for this method
public class RemoveDuplicates {
	
    public static void removeDup(String name) {
    // takes in an array of characters of the string
    	// if empty
    	if(name == "") {
    		System.out.println("empty string");
    		return;
    	}
    	// if name has one character
    	if(name.length() == 1) {
    		System.out.println("Remains same: " + name);
    		return;
    	}
    	String newName = "";
    	int count = 1 ;
    	HashMap<Character, Integer> map = new HashMap<>();
    	for(int i = 0 ; i < name.length(); i++) {
    		if(map.containsKey(map)) {
    			// do nothing, skip it
    		}else {
    			map.put(name.charAt(i), count);
    		}
    	}
    	
    	for(Character ch : map.keySet()) {
    		newName += Character.toString(ch);
    		
    	}
    	
    	
    	
       
    	System.out.println("After deleting duplicates: "+newName);
    }
    // lets say you are given an array of characers
    
    public static Character[] removeDuplicate(char[] names) {
    	// given an array of characters
    	for(int i = 0 ; i < names.length ; i++) {
    		for(int j = 1 ; j < names.length; j++) {
    			if(names[i] != names[j]) {
    				j++;
    			}else {
    				//char temp = name[j];
    				names[j] = (char) 0;
    				j++;
    			}
    		}
    	}
    	
    	String result = "";
    	for(int i= 0 ; i < names.length ; i++) {
    		result += Character.toString(names[i]);
    	}
    	
    	
    	System.out.println("final names array : "+ result);
    	return null;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name = "abbbccdeefgggjjj";
     System.out.println("Before:  " + name)  ;
     
     char[] names = {'b','b','a','c','c'};
    
     
     removeDup(name);
     removeDuplicate(names);
	}

}
