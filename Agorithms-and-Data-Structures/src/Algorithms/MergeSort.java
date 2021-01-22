package Algorithms;

public class MergeSort {
    
	public static void mergeSort(int[] array, int low, int high) {
	    if (high <= low) return;

	    int mid = (low+high)/2;
	    System.out.println("\n value of mid "+ mid);
	    mergeSort(array, low, mid);
	    mergeSort(array, mid+1, high);
	    merge(array, low, mid, high);
	}

	public static void merge(int[] array, int low, int mid, int high) {
	    // Creating temporary subarrays
	    int leftArray[] = new int[mid - low + 1];
	    int rightArray[] = new int[high - mid];

	    // Copying our subarrays into temporaries
	    for (int i = 0; i < leftArray.length; i++)
	        leftArray[i] = array[low + i];
	    for (int i = 0; i < rightArray.length; i++)
	        rightArray[i] = array[mid + i + 1];

	    // Iterators containing current index of temp subarrays
	    int leftIndex = 0;
	    int rightIndex = 0;

	    // Copying from leftArray and rightArray back into array
	    for (int i = low; i < high + 1; i++) {
	        // If there are still uncopied elements in R and L, copy minimum of the two
	        if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
	            if (leftArray[leftIndex] < rightArray[rightIndex]) {
	               array[i] = leftArray[leftIndex];
	               leftIndex++;
	            } else {
	                array[i] = rightArray[rightIndex];
	                rightIndex++;
	            }
	        } else if (leftIndex < leftArray.length) {
	            // If all elements have been copied from rightArray, copy rest of leftArray
	            array[i] = leftArray[leftIndex];
	            leftIndex++;
	        } else if (rightIndex < rightArray.length) {
	            // If all elements have been copied from leftArray, copy rest of rightArray
	            array[i] = rightArray[rightIndex];
	            rightIndex++;
	        }
	    }
	}
	
	
	public static void printArray(int[] array) {
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Given an array : ");
		int[] a = {12,11,13,5,6,7};
		// write a function here to print the array
	    printArray(a);
	    
	    // create a mergeSort()
	   mergeSort(a, 0 , a.length-1);
	   System.out.println("\nSorted array is");
	   printArray(a);
	  

	}

}
