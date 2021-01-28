package Algorithms;

public class QuickSort {
    // create the quickSort()
	public static void quickSort(int[] array, int left, int right) {
		if(left < right) {
			int pivot = partition(array, left, right);
			// recusrively sort the right and left elements of the array
			quickSort(array, left, pivot);
			quickSort(array, pivot + 1, right);
			
		}
	}
	
	public static int partition(int[] array, int left, int right) {
		int pivot = array[(left+right)/2];
		int i = left - 1;
		int j = right+1;
		
		do{ // increment array index
			i++;
		}
		while(array[i] < pivot);
		
		
		do{ // increment array index
			j--;
		}
		while(array[j] > pivot);
		
		if(i >= j) {
			return j;
		}
		// swap A[i] with A[j]
		int temp = array[i];
		int temp2 = array[j];
		array[i] = temp2;
		array[j] = temp;
		
		return pivot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] array  = {9,2,7,3,5};
       
      // printArr(array);
        quickSort(array, 0 , (array.length)-1);
       
       
	}

}
