package com.dataStructures;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //1. create a stack
		Stack<Integer> stack = new Stack<Integer>();
		
	 //2. Add elements to the stack
		System.out.println("adding items");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
	
	//3. Remove element from stack
		System.out.println("removing items");
		stack.pop();
		System.out.println(stack);
		
	// 4. check the top element
		System.out.println("Top element is : " + stack.peek());
		
	// 5. search for an element
		System.out.println("Looking for element 2: found "+stack.search(2));
		
	}

}
