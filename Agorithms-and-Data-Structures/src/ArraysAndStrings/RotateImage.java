package ArraysAndStrings;
import java.awt.*;
import java.awt.image.*;
//Given an image represented by an NxN matrix, where each pixel in the image
//is 4 bytes, write a method to rotate the image by 90 degrees Can you do this in place?
public class RotateImage {
// items in the first row become the last columns
	
	public static void rotate(int[][] matrix, int n) { 
		// if the matrix has length of 1, return it
		if(matrix.length ==  1) {
			return;
		}
		
		for(int layer = 0; layer < n/2; layer++) {
			int first = layer;
			
			int last = n -1- layer;
			
			for(int i = first; i < last; i++) {
				int offset = i - first;
				// this is the top element here
				int top = matrix[first][i];
				// left - > top
				matrix[first][i] = matrix[last - offset][first];
				// bottom - > left
				matrix[last-offset][first] = matrix[last][last - offset];
				// right - > bottom
				matrix[last][last-offset] = matrix[i][last];
				// top - > right
				matrix[i][last] = top;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	}

}
