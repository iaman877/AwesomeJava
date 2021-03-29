
import java.util.*;
public class Main {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the first Number ");
       int a = s.nextInt();
      System.out.println("Enter the Second Number ");
      int b = s.nextInt();
      System.out.println("Enter the OPeration ");
       s.nextLine();
       char operation = s.nextLine().charAt(0);
       int result = 0;
       switch(operation) {
       case '+':
    	   result = a+b;
    	     break;
       case '-' :
            result = a-b;
             break;
       case '*' :
    	    result = a*b;
    	       break;
       case '/' :
    	    System.out.println("Invalid operation");
       }
       System.out.println("the result is "+ result);
    }
}
