//  After the throw statement, no other statement should be placed in that block. Java will give unreachable statement, compile time error.

 import java.util.*;
class Main
 {
   public static void main(String args[])
    {
      System.out.println("Enter a even number");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      if(n%2==0)
        {
           System.out.println("Number " +n +" is even");
        }
        else
          {
            throw new ArithmeticException("Invalid Number");
             System.out.println("rest of the program ");
          }
    }
 }
 
 // we will get compile time error 
