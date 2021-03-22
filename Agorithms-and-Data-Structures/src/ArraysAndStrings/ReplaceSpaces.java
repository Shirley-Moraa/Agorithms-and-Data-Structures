package ArraysAndStrings;
// Write a method to replace all spaces in a string with ‘%20’
public class ReplaceSpaces {
    //method one, use .replace()
	public static String replaceSpaces1(String name) {
    	
    	return name.replace(" ", "%20");
    }
    
    
    // method2
	public static String replaceSpaces2(String name) {
    	String[] words = name.split(" ");
    	StringBuilder sentence = new StringBuilder(words[0]);
    	
    	for(int i= 1; i < words.length ; i++) {
    		sentence.append("%20");
    		sentence.append(words[i]);
    	}
		
    	return sentence.toString();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name = "John Doe hj ";
    
    System.out.println(replaceSpaces1(name));
    System.out.println(replaceSpaces2(name));
	}

}
