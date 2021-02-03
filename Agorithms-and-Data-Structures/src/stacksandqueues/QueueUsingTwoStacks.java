package stacksandqueues;

import java.util.Stack;

public class QueueUsingTwoStacks {
  
    	// create 2 stacks
    	Stack<Integer> stack = new Stack<Integer>();
    	Stack<Integer> st2 = new Stack<Integer>();
    	
    	public void push(int x) {
    		// add the item to our stack
    		stack.push(x);
    		System.out.println("pushed: " + x);
    	}
    	
    	public int pop() {
    		// pop all the elements from stack  to st
    		while(!stack.isEmpty()) {
    			st2.push(stack.pop());  // we push to st as we pop from stack
    		}
    		int removed = st2.pop();
    		
    		// copy back all elements to stack
    		while(!st2.isEmpty()){
                stack.push(st2.pop());
            }
    		
    		System.out.println("popped: " + removed);
    		return removed;
    	}
    	
    	
    	public int peek() {
    		// pop all the elements from stack  to st
    		while(!stack.isEmpty()) {
    			st2.push(stack.pop());  // we push to st as we pop from stack
    		}
    		int top = st2.peek();
    		
    		// copy back all elements to stack
    		while(!st2.isEmpty()){
                stack.push(st2.pop());
            }
    		
    		System.out.println("top element: " + top);
    		return top;
    	}
    	
    	public boolean empty() {
    		return stack.isEmpty() && st2.isEmpty();
    	}
    	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		QueueUsingTwoStacks newQ = new QueueUsingTwoStacks(); 
		newQ.push(1); newQ.push(2); newQ.push(3); newQ.push(4); 
		newQ.pop();
		newQ.peek();
		System.out.println("is the queue empty? ");
		System.out.println(newQ.empty());
		newQ.pop();
		newQ.peek();
		
		 
	}

}
