package sortingAndSearching;

public class MergeSort {
	
    public static void mergeSort(int[] array , int left, int right) {
    	if(right <= left) {
    		return;
    	}
    	
    	int mid = (left + right)/2;
    	System.out.println("value of mid is :"+mid);
    	mergeSort(array, left, mid);
    	mergeSort(array, mid+1, right);
    	System.out.println("value of mid is :"+mid);
    	merge(array, left, mid, right);
    }
    
    public static void merge(int[] array, int left ,int mid, int right) {
    	System.out.println("value of mid is :" + mid);
    	int lSize = mid - left +1;
    	int rSize = right - mid;
    	
    	// create some arrays then fill the values
    	int[] leftArr = new int[lSize];
    	int[] rightArr = new int[rSize];
    	
    	for(int i =0 ; i < lSize ; i++) {
    		leftArr[i] = array[left + i];
    		System.out.println("left");
    		System.out.println(leftArr[i]);
    	}
    	
    	for(int j = 0 ; j < rSize ; j++) {
    		rightArr[j] = array[mid + 1 + j];
    		System.out.println("right");
    		System.out.println(rightArr[j]);
    	}
    	
    	int  i = 0;
    	int j = 0;
    	
    	//We merge the two subarrays as we compare them 
    	for(int k = left ; k < right + 1; k++) {
    		if(  i < lSize && j < rSize) {
    			if(leftArr[i] < rightArr[j]) {
	    			array[k] = leftArr[i];
	    			i++;
	    		}else {
	    			array[k] = rightArr[j];
	    			j++;
	    		}
    		}else if(i < lSize ) {
    			array[k] = leftArr[i];
    			i++;
    			k++;
    		}else {
    			array[k] = rightArr[j];
    			j++;
    			k++;
    		}
	    		
    	}
  	
    }
    
    public static void showArr(int[] arr) {
    	for(int i = 0 ;i < arr.length ;i++) {
    		System.out.print(arr[i] + ",");
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
       int[] array = {4,7,6,9,2,3};
       showArr(array);
       mergeSort(array, 0, (array.length)-1);
       showArr(array);
       
	}

}
