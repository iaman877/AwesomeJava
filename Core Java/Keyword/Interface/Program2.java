/* Why Java doesn’t support Multiple Inheritance? */

class A1 
{ 
	void fun1() 
	{ 
		System.out.println("Inside fun1"); 
	} 
} 
class A2 
{ 
	void fun2() 
	{ 
		System.out.println("Inside fun2"); 
	} 
} 
class Main extends A1, A2        // after comple , we will get an error because compiler does know this syntax therefore compiler will show compile time error 
{ 
public static void main(String args[]) 
 { 
	Main t = new Main(); 
	t.fun1(); 
	t.fun2();
 } 
} 
/* 1. The Diamond Problem: */

class A1
{ 
	void fun() 
	{ 
		System.out.println("A1"); 
	} 
} 

class A2 extends A1
{ 
	void fun() 
	{ 
		System.out.println("A2"); 
	} 
} 

class A3 extends A1
{ 
	void fun() 
	{ 
		System.out.println("A3"); 
	} 
} 

class Main extends A2, A3 
{ 
public static void main(String args[]) 
{ 
	Main t = new Main(); 
	t.fun(); 
} 
} 


// A simple Java program to demonstrate multiple inheritance through default methods. 

interface A1
{ 
	default void show()          	// default method 
	  { 
		System.out.println("inside default A1"); 
      } 
} 
interface A2
{ 
	default void show()           	// Default method 
	{ 
		System.out.println("indide default A2"); 
	} 
} 
class Main implements A1, A2      // Implementation class code 
{ 
	public void show()      	   // Overriding default show method 
	{ 
		A1.super.show();       		// use super keyword to call the show method of PI1 interface 
		A2.super.show();        		// use super keyword to call the show  method of PI2 interface 
	}   
	public static void main(String args[]) 
	{ 
		Main d = new Main(); 
		d.show(); 
	} 
} 

// A simple Java program to demonstrate how diamond  problem is handled in case of default methods 

interface A1 
{ 
	default void fun() 
	{ 
		System.out.println("Inside Default fun   "); 
	} 
} 
interface A2 extends A1 {} 
interface A3 extends A1 {} 
class Main implements A2, A3 
{ 
	public static void main(String args[]) 
	{ 
		Main d = new Main(); 
		d.fun(); 
	} 
} 


