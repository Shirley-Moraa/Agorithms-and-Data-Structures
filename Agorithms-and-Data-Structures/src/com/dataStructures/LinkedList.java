package com.dataStructures;

public class LinkedList {
    Node head;
    
    public void addNode(int key) {
    	// create a new Node
    	Node newNode = new Node(key);
    	
    	// check if head is null
    	if(head == null) {
    		newNode.next = head;
    		head = newNode;
    		
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // create a linkedlist , add CRUD functions
		LinkedList one = new LinkedList();
		
		one.addNode(2);
		
		
		
	}

}
class Node{
	int key;
	Node next;
	
	public Node(int key) {
		this.key = key;
	}
	
	public String toString() {
		return "added : " + key ;
	}
	
}
