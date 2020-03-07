import java.util.*;
class ExThrows1
{
   static void divideNum() throws ArithmeticException
   {
    int a=50;
    System.out.println("Enter the value of b");
    Scanner s=new Scanner(System.in);
    int b=s.nextInt();
    int c=a/b;
    System.out.println("Value of c is:"+c);
   }
   public static void main(String args[])
   {
   try
      {
        divideNum();
      }
     catch(ArithmeticException e)
       {
         System.out.println("caught Exception"+e);
       }
       System.out.println("Rest of the code");
    }
}
