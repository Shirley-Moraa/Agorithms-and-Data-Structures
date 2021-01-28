package com.dataStructures;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // create a stack , make CRUD functionalities
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(8);
		stack.push(3);
		stack.push(2);
		
		if(stack.empty() != true){
		System.out.println(stack.pop());
		}
		
		int top = stack.peek();
		
	}

}
