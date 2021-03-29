// replace function is return type string
import java.io.*; 
import java.lang.*; 

class Main { 
	public static void main(String[] args) 
	{ 
		String s = "Aman"; 		// Declare String without using new operator 
		s = s + " Kumar";
		System.out.println(s.replace("A","C"));   // Caman Kumar 
	} 
} 
