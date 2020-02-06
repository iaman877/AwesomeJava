import java.io.*; 
class C1 
{ 
	int n; 
	String name; 
	C1() 
	{ 
		System.out.println("Constructor called"); 
	} 
} 
class Main
{ 
	public static void main (String[] args) 
	{ 
		C1 g = new C1();           	// this would invoke default constructor. 
		System.out.println(g.name); 
		System.out.println(g.n);       // values to the object like 0, null
	} 
} 
