package com.trees;
//Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height
public class minimalHeight {
	static Node1 root;
	
  public static Node1 addToTree(int[] array, int start, int end) {
  	
  	if(end < start) {
  		return null;
  	}
  	//find the mid point
  	 int mid =( start + end )/2;
  	 
  	 // make it the root
  	 Node1 newNod = new Node1(array[mid]);
  	 
  	 root = newNod;
  	 root.left = addToTree(array, start,mid-1);
  	 root.right = addToTree(array, mid+1, end);
  	 return root;
  	 
  		
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] array = {1,2,3,4,5,6,7};
     
     int l = 0;
     int r= array.length;
  
     addToTree(array, l, r);
  		   
   
	}

}
//create a node class, 
class Node1{
	int key;
	
	Node1 left;
	Node1 right;
	
	Node1(int key){
		this.key = key;
	}
	
	public String toString() {
		return "Node1: " + key;
	}
}
