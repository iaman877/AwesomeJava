import java.util.*;
class Main
{
  static void divideNum()
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
   divideNum();
   System.out.println("Rest of the code");
 }
}
