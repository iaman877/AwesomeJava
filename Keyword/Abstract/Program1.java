// Like C++, in Java, an instance of an abstract class cannot be created, we can have references of abstract class type though.

abstract class A1 
{ 
	abstract void print(); 
} 
class Derived extends A1 
{ 
	void print()
	    {
	        System.out.println("Derived print() called");
	    } 
} 
class Main
{ 
	public static void main(String args[]) { 
		A1 b = new Derived(); 
		b.print(); 
	} 
} 
//-----------------------------------------------------------------------------------------------------------------

// An abstract class with constructor 

abstract class A1
{ 
	A1() 
	{
	    System.out.println("Base Constructor Called"); 
	} 
     	abstract void fun(); 
} 
class Derived extends A1
{ 
	Derived()
	  {
	      System.out.println("Derived Constructor Called");
	  } 
	void fun() 
	    {
	        System.out.println("Derived fun() called");
	    } 
} 
class Main { 
	public static void main(String args[]) { 
	Derived d = new Derived(); 
	d.fun();
	} 
} 
//-------------------------------------------------------------------------------------------------------------------

// An abstract class without any abstract method 

abstract class A1
{ 
	void fun() 
	   { 
	       System.out.println("Base fun() called");
	   } 
} 

class Derived extends A1
{    
        Derived()
          {
              System.out.println("Derived Constructor Called"); 
          } 
       void fun() 
            {
                System.out.println("Derived fun() called");
            } 
} 

class Main { 
	public static void main(String args[])
	{ 
		Derived d = new Derived(); 
		d.fun(); 
	} 
} 
