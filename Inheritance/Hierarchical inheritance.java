// Java program to illustrate the  concept of Hierarchical inheritance 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class A1
{ 
	public void print1() 
	{ 
		System.out.println("Internet"); 
	} 
} 

class A2 extends A1 
{ 
	public void print2() 
	{ 
		System.out.println("of"); 
	} 
} 

class A3 extends A1 
{ 
   public void print3() 
	{ 
		System.out.println("things"); 
	} 
} 

// Drived class 
public class Main 
{ 
	public static void main(String[] args) 
	{ 
		A3 g = new A3(); 
		g.print1();
//		g.print2();    // it is not illegal
		g.print3();
		A2 t = new A2(); 
		t.print2(); 
		t.print1();
//		t.print3();     // it is also not illegal
	} 
} 
