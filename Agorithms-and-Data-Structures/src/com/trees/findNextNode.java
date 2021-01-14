package com.trees;
// Write an algorithm to find the ‘next’ Node3 (i e , in-order successor) of a given Node3 in a 
//binary search tree where each Node3 has a link to its parent
public class findNextNode {
	Node3 root;
	
	public Node3 findNextNode3(Node3 focusNode3) {
		// given a Node3 create its parent
		if(focusNode3 != null) {
			Node3 parent;
			
			//check if it has children, return 1st right inorder child
			if(focusNode3.parent == null || focusNode3.rightChild != null) {
			parent = leftMostchild(focusNode3.rightChild);
		    }else {
			// go up till we are on the leftside
			
				while((parent = focusNode3.parent) != null) {
					if(parent.leftChild == focusNode3) {}
					break;
				}
			focusNode3 = parent;
		
		   }
			return parent;
		}	
		return null;
		
	}
	

	public static  Node3 leftMostchild(Node3 e) {
		if( e == null) {
			return null;
		}
		while(e.leftChild != null) {
			e = e.leftChild;
		}
		
		return e;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Node3{
	int key ;
	String name;
	
	Node3 leftChild;
	Node3 rightChild;
	Node3 parent;
	
	Node3(int key, String name){
		this.key = key;
		this.name = name;
	}
	
	
	public String toString() {
		return "name:" + name + "key" + key;
	}
	
	
}
