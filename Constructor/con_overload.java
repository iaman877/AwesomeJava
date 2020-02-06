import java.io.*; 
class A
{ 
	A(String name) 
	{ 
		System.out.println("Constructor with String : " + name); 
	} 
	A(String name, int age) 
	{ 
		System.out.println("Constructor with String and Integer : " + name + " "+ age); 
	} 
	A(long id) 
	{ 
		System.out.println("Constructor with Long :"+id); 
	} 
} 

class Main 
{ 
	public static void main(String[] args) 
	{ 
		 A ob1 = new A("Aman"); 
		 A ob2 = new A("Bhardwaj", 19); 
		 A ob3 = new A(82009); 
	} 
} 
