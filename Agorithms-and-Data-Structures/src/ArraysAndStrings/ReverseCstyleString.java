package ArraysAndStrings;

import java.util.Stack;

//Write code to reverse a C-Style String (C-String means that “abcd” is represented as 
//five characters, including the null character )
public class ReverseCstyleString {
    // method1
	public static String reverseCString(String cString) {
		Stack<Character> stack = new Stack<>();
		// stack is good for reversing
		for(int i = 0 ; i < cString.length(); i++) {
			stack.add(cString.charAt(i));
		}
		
		String temp = "";
		
		while(!stack.isEmpty()) {
			//System.out.println(stack.pop());
			temp += stack.pop();
		}
		
		System.out.println(temp);
		
		return null;
	}
	
	 //method 2
	static String temp = "";
	public static void reverseCString2(String cString) {
		// create an empty string, reverse from the back as we add to a new string
		
		int i = cString.length() -1;
		while(i >= 0) {
			temp +=  cString.charAt(i);
			i--;
		}
		
		System.out.println("before: "+cString + " : new reversed array After: " + temp);
		// running time is O(n), way easier lol
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String cString = "hello ";
      System.out.println(cString.length());
      
      //reverseCString(cString);
      
      reverseCString2(cString);
      
	}
	// running time O(n^2)

}
