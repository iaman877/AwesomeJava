 // wap to accept an integer number and to print the sum of square of all the numbers from 1 to n

import java.util.*; 
import java.lang.*; 
class Square
{ 
	public static void main(String args[]) 
	{ 
	      int n;
	      Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :");
            n = s.nextInt();
	    	int sum = 0; 
	    	for (int i = 1; i <= n; i++) 
			sum += (i * i); 
			System.out.println("Sum is "+sum);
	} 
}
