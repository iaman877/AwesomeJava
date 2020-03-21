import java.io.*; 
import java.lang.*; 

class Main { 
	public static void main(String[] args) 
	{ 
		String s = "Aman"; 		// Declare String without using new operator 
		System.out.println("String s = " + s);  // Prints the String. 
		String s1 = new String("Aman");    	// Declare String using new operator
		System.out.println("String s1 = " + s1);  // Prints the String. 
		System.out.println(s.equals(s1));   // true , because it only check value not location  
	} 
} 
