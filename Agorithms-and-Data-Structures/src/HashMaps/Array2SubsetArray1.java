package HashMaps;

import java.util.HashMap;

//Given two arrays: arr1[0..m-1] and arr2[0..n-1]. 
//Find whether arr2[] is a subset of arr1[] or not.
//Both the arrays are not in sorted order. It may be assumed that elements in both array are distinct.
public class Array2SubsetArray1 {
	
	public static boolean isBsubsetOfA(int[] arr1, int[] arr2) {
		// method 1: create two for loops and have a counter
		int counter = 0;
		for(int i = 0 ; i< arr2.length; i++) {
			for(int j = 0 ; j < arr1.length ; j++) {
				if(arr2[i] == arr1[j]) {
					// increment counter
					counter++;	
					break;
				}
			}
		}
		
		if(counter == arr2.length) {
			return true;
		}
		
		//time complexity is big O(size of Arr1 * size of Arr2); O(m*n) where m=Arr1.length , n=Arr2.length
		return false;
	}
	
	public static boolean isBsubsetOfAHash(int[] arr1, int[] arr2) {
		// method 2: use a HashMap()
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int count = 1;
		for(int i = 0 ; i< arr2.length; i++) {
			map.put(arr2[i],count);
		}
		for(int j = 0 ; j < arr1.length ; j++) {
				if(map.containsKey(map.containsKey(arr1[j]))) {
					map.replace(arr1[j], count++);
							
				}
			}
		
		for(Integer i : map.keySet()) {
			if(map.get(i) == 1) {}
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we have two arrays
		int[] arr1 = {11, 1, 13, 21, 3, 7};
		int[] arr2 = {11, 3, 7, 1,77} ;
		
		boolean res = isBsubsetOfA(arr1,arr2);
		boolean res2= isBsubsetOfAHash(arr1,arr2);
		
		System.out.println(res + " B is subset of A!");
		System.out.println(res + " Arr2 is subset of Arr1!");
	}

}
