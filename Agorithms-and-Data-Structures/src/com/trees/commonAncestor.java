package com.trees;
// Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree 
//Avoid storing additional nodes in a data structure NOTE: This is not necessarily a binary search tree

//similar questions: find lowest common ancestor

public class commonAncestor {

	
	public Node4 findCommonAncestor(Node4 root,Node4 one, Node4 two) {
		Node4 parent = root;
		
		if(root == null) {
			return null;
		}
		// if they have the same parent or share the root node, return the root node;
		if(parent.leftChild == one && parent.rightChild== two || parent.rightChild == one && parent.leftChild== two) {
			
			return parent;
		} else {
			// if the two nodes are less than root search the right side
			if(one.key < parent.key && two.key<parent.key) {
				parent = parent.leftChild;
				findCommonAncestor(parent, one, two);
			// if the two nodes are greater than root search the right side
			}else if(one.key > parent.key && two.key > parent.key){
				parent = root.rightChild;
				findCommonAncestor(parent, one, two);
			}
			
			
			
		}
		
		return parent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test code

	}

}
class Node4{
	int key ;
	
	Node4 leftChild;
	Node4 rightChild;
	Node4 parent;
	
	Node4(int key){
		this.key = key;
	
	}
	
	
	public String toString() {
		return "key" + key;
	}
	
	
}
