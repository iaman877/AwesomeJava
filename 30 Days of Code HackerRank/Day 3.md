# Task
Given an integer,n , perform the following conditional actions:

* If n is odd, print Weird
* If n is even and in the inclusive range of 2 to 5, print Not Weird
* If n is even and in the inclusive range of  6 to 20, print Weird
* If n is even and greater than 20, print Not Weird

## Sample Input 0
 3
## Sample Output 0
Weird

## Sample Input 1
24

## Sample Output 1
Not Weird

```
import java.util.*;
public class Solution
{
   
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        scan.close();
        System.out.println( ((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
    }
}


```
