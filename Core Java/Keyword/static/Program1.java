/* JAVA STATIC VARIABLE
    1) The static variable can be used to refer the common property of all objects (that is not unique
    for each object) e.g. company name of employees,college name of students etc.
    2) The static variable gets memory only once in class area at the time of class loading.      */

class Main
{
 int rollno;
 String name;
 static String college ="ITS";

 Main(int r,String n)
 {
  rollno = r;
  name = n;
 }
 void display ()
   { 
       System.out.println(rollno+" "+name+" "+college);
       
   }

 public static void main(String args[])
{
  Main s1 = new Main(111,"Karan");
  Main s2 = new Main(222,"Aryan");

 s1.display();
 s2.display();
 }
 }
 
/* JAVA STATIC METHOD
  1) A static method belongs to the class rather than object of a class.
  2) A static method can be invoked without the need for creating an instance of a class.
  3) static method can access static data member and can change the value of it.             */
  
  class Main
{
    int rollno;
    String name;
    static String college = "ITS";
    static void change()
          {
             college = "UPES";
          } 
Main(int r, String n)
 {
   rollno = r;
   name = n;
 }
void display ()
 {
     System.out.println(rollno+" "+name+" "+college);
     
 }
public static void main(String args[]){
Main.change();
Main s1 = new Main (111,"Karan");
Main s2 = new Main (222,"Aryan");
Main s3 = new Main (333,"Arjun");
s1.display();
s2.display();
s3.display();
}
} 
//-----------------------------------------------------------------------------------------------------------
/* JAVA STATIC BLOCK
    1) Is used to initialize the static data member.
    2) It is executed before main method at the time of classloading.   */
    
class Main
{
  static
  {
   System.out.println("static block is invoked");
  }
  public static void main(String args[])
    {
      System.out.println("Hello main");
   }
} 

