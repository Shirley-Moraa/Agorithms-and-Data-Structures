package stacksandqueues;

import java.util.Stack;

//How would you design a stack which, in addition to push and pop, 
//also has a function min which returns the minimum element?
//		Push, pop and min should all operate in O(1) time
public class MyStack {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
    
	// automatically add to stack 1 , then add min value to stack2
	public void add(int x) {
		stack1.push(x);
		
		if(stack2.isEmpty()) {
			// first element is the smallest value so far
			stack2.push(x);
		}else {
			// we have more than one value added to stack1
			if(x < stack2.peek()) {
				// check if value of x is < top value of Stack2, only then can we add
				stack2.push(x);
			}
		}
		
		
	}
	
	public int returnMin() {
		return stack2.peek();
	}
	
	public void delete() {
		// in the event we pop from stack1, we check if the value is in stack2 and pop it too
		int deleted = stack1.pop();
		
		if(stack2.peek() == deleted) {
		  //  delete it from stack2, value should be at the top most
			stack2.pop();
			
		 }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // create a new Stack
		MyStack num = new MyStack();
		num.add(2);
		num.add(8);
		num.add(0);
		num.add(-6);
		num.add(4);
		num.delete();
		num.delete();
		System.out.println(num.returnMin());
		num.delete();
		System.out.println(num.returnMin());
	
	}

}
