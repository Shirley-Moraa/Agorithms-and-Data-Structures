package sortingAndSearching;

import java.lang.reflect.Array;

public class QuickSort {
	     public static void quickSort(int[] array, int left, int right) {
	    	 if(right <= left) {
	    		 return;
	    	 }
	    	// find the pivot
	    	 int pivot = partition(array, left,right);
	    	 
	    	 // pass the Left and Right parts of the array
	    	 quickSort(array, left, pivot -1);
	    	 quickSort(array, pivot+1, right);
	    
	     }
	     
	     public static int partition(int[] array, int right , int left) {
	    	 int pivot = right;
	    	 
	    	 int counter = left;
	    	 // going through the array
	    	 for(int i = left; i< right ; i++) {
	    		 // if 1st element is less than the last element
	    		 if(array[i] < array[pivot]) {
	    			 // create temp var
	    			 int temp = array[counter];
	    			 array[counter] = array[i];
	    			 array[i] = temp;
	    			 counter++;
	    		 }
	    	 }
	    	 int temp = array[pivot];
	    	 array[pivot] = array[counter];
	    	 array[counter] = temp;
	      
	    	 return counter;
	    	 
	    	 
	     }

	
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]+ " ,");
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] array = {4,7,6,5,1};
		  
		  printArray(array);
		  
		   quickSort(array, 0 ,(array.length));
		   
		  printArray(array);
	}

}
