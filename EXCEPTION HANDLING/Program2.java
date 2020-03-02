import java.util.*;
class TestThrow
{
   public static void main(String args[])
 {
   System.out.println("Enter an even number");
   Scanner s=new Scanner (System.in);
   int n=s.nextInt();
    if(n%2==0)
      {
        System.out.println("Number " +n +" is even");
      }
      else
      {
       throw new ArithmeticException("Invalid Number");
        System.out.println("rest of program");
       }
    }
}
