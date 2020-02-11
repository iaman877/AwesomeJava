/*1) FINAL VARIABLE
  If you make any variable as final, you cannot change the value of final variable(It will beconstant).  */

/* There is a final variable speed limit, we are going to change the value of this variable, but It can't be changed because 
final variable once assigned a value can never be changed. */

class Main
{
 final int speedlimit=90;      // final variable
 void run()
     {
         speedlimit=400;
     }
 public static void main(String args[])
 {
   Main obj=new Main();
   obj.run();
 }
}
//--------------------------------------------------------------------------------------------------------------------
/* 2) FINAL METHOD
   If you make any method as final, you cannot override it.  */
   
 class Bike
{
   final void run()
     {
        System.out.println("running");
     }
}

 class Main extends Bike
{
  void run()
    { 
        System.out.println("running safely with 100kmph");
        
    }
 public static void main(String args[])
 {
   Main honda= new Main();
   honda.run();
 }
}
//--------------------------------------------------------------------------------------------------------------------
/* 3) FINAL CLASS
   If you make any class as final, you cannot extend it. */
  final class Bike
{
    void run()
     {
        System.out.println("running");
     }
}

 class Main extends Bike
{
  void run()
    { 
        System.out.println("running safely with 100kmph");
        
    }
 public static void main(String args[])
 {
   Main honda= new Main();
   honda.run();
 }
} 
