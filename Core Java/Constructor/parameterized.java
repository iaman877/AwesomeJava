import java.io.*; 
class A 
{ 
	String name; 
	int id; 
 	A(String name, int id) 
	{ 
		this.name = name; 
		this.id = id; 
	} 
} 

class Main
{ 
	public static void main (String[] args) 
	{ 
		A g = new A("adam", 1);       	// this would invoke the parameterized constructor. 
		System.out.println("MY Name :"+g.name +" and My Id :"+g.id); 
	} 
} 
