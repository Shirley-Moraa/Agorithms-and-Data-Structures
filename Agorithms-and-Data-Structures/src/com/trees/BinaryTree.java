package com.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//You have two very large binary trees: T1, with millions of nodes, and T2, with hun- dreds of nodes 
//1. Create an algorithm to decide if T2 is a subtree of T1
public class BinaryTree {
	static Node root;
	
	public void addNode(int key, String name) {
		
		// create a new node
		Node newNode = new Node(key, name);
		
		// check if the root is null
		if(root == null) {
			root = newNode;
		}else {
			Node focusNode = root;
			Node parent;
			
			
			while(true) {
				parent = focusNode;
				
				// check if key is greater or smaller than 	
				if(key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if(focusNode == null) {
						parent.leftChild = newNode;
						return;
					   }
				 }else {
					 focusNode = focusNode.rightChild;
					 if(focusNode == null) {
						 parent.rightChild = newNode;
						 return;
					 }
				 }
			}
		}
	}
	
	//2. In order traversal
	public void inOrderTraversal(Node focusNode) {
		if(focusNode != null) {
			
			inOrderTraversal(focusNode.leftChild);
			
			System.out.println(focusNode);
			
			inOrderTraversal(focusNode.rightChild);		
			
		}
	}
	
	//3. post order traversal
	public void preOrderTraversal(Node focusNode) {
		if(focusNode != null) {
			
			System.out.println(focusNode);
			
			preOrderTraversal(focusNode.leftChild);
			
			preOrderTraversal(focusNode.rightChild);		
			
		}
	}
	
	//4. pre order traversal
	public void postOrderTraversal(Node focusNode) {
		if(focusNode != null) {
			
			postOrderTraversal(focusNode.leftChild);
			
			postOrderTraversal(focusNode.rightChild);
			
			System.out.println(focusNode);
			
		}
	}
	
	//5. how to find a node
	public Node findNode(int key) {
		
		Node focusNode = root;
		
		while(focusNode.key != key) {
			
			if(key < focusNode.key) {
				focusNode = focusNode.leftChild;
			}else {
				focusNode = focusNode.rightChild;
			}
			
			if(focusNode == null) {
				return null;
			}
			
		}
		
		return focusNode;
	}
	
	//6.  print all paths which sum up to that value 
	static int sum = 0;
	static Stack<Integer> stack = new Stack<Integer>();
	public void preOrderPrintSum(Node root , int val) {
		Node focusNode = root;
		// check if the root is empty
         if(focusNode == null) {
        	  return;
         }
         
         sum = sum + focusNode.key;
         stack.push(focusNode.key);
        
         
         if(sum == val) {
        	 // print the stack
        	 System.out.println("path has been found");
        	 System.out.println(stack);
         }
         
         
         preOrderPrintSum(focusNode.leftChild, val);
         
         preOrderPrintSum(focusNode.rightChild, val);
         
         sum = sum - focusNode.key;
         stack.pop();
         
        
		
	}
	
	
	// main function
	public static void main(String[] args) {
		//
		BinaryTree theTree = new BinaryTree();
		
		theTree.addNode(50, "Boss");
		theTree.addNode(25, "Vice Pres");
		theTree.addNode(15, "Office Manager");
		theTree.addNode(30, "Secretary");
		theTree.addNode(70, "Sales Manager");
		theTree.addNode(85, "Salesman 1");
		
		theTree.inOrderTraversal(theTree.root);
		
		theTree.preOrderTraversal(theTree.root);
		
		theTree.preOrderTraversal(theTree.root);
		
		System.out.println("Search for 30");
		
		System.out.println(theTree.findNode(30));
	
		 theTree.preOrderPrintSum(theTree.root, 90);
		 
	
	
	}

}

class Node{
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name){
		this.key = key;
		this.name = name;
	}
	
	public String toString() {
		return  name + " has a key " + key;
	}
}



