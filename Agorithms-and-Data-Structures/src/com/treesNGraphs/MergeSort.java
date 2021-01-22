package com.treesNGraphs;

public class MergeSort {
        
	public static int[] mergeSort(int[] array) {
		// TODO Auto-generated method stub
		// find the length of the array
		int arrSize = array.length;
		
		// find the midpoint
		int midPoint = arrSize/2;
		System.out.println("the midpoint is: " + midPoint);
		
		// divide the array into two
		int[] leftArray=  new int[midPoint];
		int[] rightArray = new int[arrSize - midPoint];
		
		int k =0;
		
		for(int i = 0 ; i < leftArray.length ; i++) {
			leftArray[i] = array[k];
			k++;
		}
		
		for(int j = 0 ; j < rightArray.length; j++) {
			rightArray[j] = array[k];
			k++;
		}
		return rightArray;
		
	}  
	
	
	public static void printArr(int[] array) {
		for(int i = 0 ; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {8,0,7,4};	
		
		printArr(array);
		
		System.out.println("");
	
		int[] result = mergeSort(array);
		
		printArr(array);
	}


}
