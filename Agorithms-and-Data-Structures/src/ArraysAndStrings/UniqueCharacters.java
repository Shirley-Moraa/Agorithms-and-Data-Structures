package ArraysAndStrings;
//Implement an algorithm to determine if a string has all unique characters 
//What if you can not use additional data structures? 
// If we could use additional data structures;I'd use a hashmap to count each character and the number of times it appears, 
// if the value of character is 2, not unique;
public class UniqueCharacters {
    
	public static boolean checkUnique(String name) {
		for(int i = 0 ; i < name.length(); i++) {
			char k = name.charAt(i);
			for(int j = i+1 ; j < name.length(); j++) {
				int res  = Character.compare(k, name.charAt(j));
				if(res == 0) {
					return false;
				}
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name ="ll";
    
    if(checkUnique(name) == false) {
    	System.out.println("name does not have unique characters: " + name);
    }else {
    	System.out.println("name has unique characters: " + name);
    }
     
 // Running time: big O(n*m) or ~ O(n^2) because of the double for loops
	} 

}
