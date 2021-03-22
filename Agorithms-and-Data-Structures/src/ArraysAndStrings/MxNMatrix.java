package ArraysAndStrings;
//Write an algorithm such that if an element in an MxN matrix is 0, 
//its entire row and column is set to 0
public class MxNMatrix {
	// to print contents of the Matrix
    public static void setZeros(int[][] array) {
    	int[] row = new int[array.length];
    	int[] column = new int[array[0].length];
    	for(int i = 0 ; i < array.length; i++) {
    		for(int j =0 ; j < array[0].length; j++) {
    			int val = array[i][j];
    			if(val == 0) {
    				row[i] = 1;
    				column[j] = 1;
    				//System.out.print("Congratulations ");
    			}
    			System.out.print(array[i][j] + ",");	
    		}
    		System.out.println();
    	}
    	
    	// set array[i][j] to 0 if either of them has a zero
    	for(int i = 0 ; i < array.length ; i++){
    		for(int j=0; j < array[0].length; j++) {
    			if(row[i] == 1 || column[i] == 1) {
    				array[i][j] = 0;
    			}
    		}
    	}
	 
    	// call the print()
    	System.out.println("\n New array \n");
    	printArray(array);
    	 	
    }
    
    public static void printArray(int[][] arr) {
    	for(int i =0 ;i < arr.length ; i++) {
    		for(int j= 0 ;j < arr[0].length; j++) {
    			System.out.print(arr[i][j] + ",");
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // to create a 2d Matrix
		int[][] scores = {
				            {20,18,22,20,16},
				            {18,20,18,21,20},
				            {16,18,0,20,24},
				            {25,24,22,24,30}
		                 };
		
		// create a function to print the matrix
	    setZeros(scores);	
	}
	

}
