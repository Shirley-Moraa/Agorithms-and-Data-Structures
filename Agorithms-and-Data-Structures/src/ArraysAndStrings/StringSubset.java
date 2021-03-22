package ArraysAndStrings;
//Assume you have a method isSubstring which checks if one word is a substring of another 
//Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one 
//call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)
public class StringSubset {
    
	public static boolean isSubstring(String s1, String s2) {
		// check if the two are of same length?
		int n = s1.length();
		if(s1.length() == s2.length() && n > 0) {
			String s1s1 = s1+s1;
			if(s1s1.contains(s2)) {
				return true;
			}
			
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1 = "waterbottle";
      String s2 ="erbottlewat";
      boolean res = isSubstring(s1,s2);
      System.out.println("Is s2 rotation of S1?  " + res);
	}

}
