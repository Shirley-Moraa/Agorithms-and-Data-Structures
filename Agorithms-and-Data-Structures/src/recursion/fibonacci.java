package recursion;

public class fibonacci {
    public static int fib(int n) {
    	if(n <= 1) {
    		return n;
    	}else if(n > 1) {
    	    return fib(n-1) + fib(n-2);
    	}else {
    		return -1;
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // find the nth fibonacci number
		int n = 5;
		int res = fib(n);
		System.out.println("The " + n + " fibonacci number is: " + res);
		
	}

}
