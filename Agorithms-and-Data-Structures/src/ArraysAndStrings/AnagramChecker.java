package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;

//Write a method to decide if two strings are anagrams or not
//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
//typically using all the original letters exactly once
public class AnagramChecker {
    public static boolean checkAnagram(String one, String two) {
    	// break the strings into arrays
    	 char[] oneString = one.toCharArray();
    	 char[] twoString = two.toCharArray();
    	// sort them in ascending order, they should be equal
    	 Arrays.sort(oneString);
    	 Arrays.sort(twoString);
    	// compare if the two arrays are same 
    	 if(oneString == twoString) {
    		 return true;
    	 }
    	
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // for two string to be anagrams, each letter has to appear as  many time 
		String one= "hello";
		String two = "ll";
		boolean res = checkAnagram(one, two);
		System.out.println(res);
	}

}
