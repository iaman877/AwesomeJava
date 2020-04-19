# Task
* Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must:
* Declare 3 variables: one of type int, one of type double, and one of type String.
* Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
* Use the  operator to perform the following operations:
* Print the sum of  plus your int variable on a new line.
* Print the sum of  plus your double variable to a scale of one decimal place on a new line.
* Concatenate  with the string you read as input and print the result on a new line.

## Input Format

* The first line contains an integer that you must sum with i.
* The second line contains a double that you must sum with d .
* The third line contains a string that you must concatenate with s  .

## Output Format

Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.

## Sample Input

* 12
* 4.0
* is the best place to learn and practice coding!

## Sample Output

* 16
* 8.0
* HackerRank is the best place to learn and practice coding!

```
import java.util.*;
public class Solution {
   
   public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
      
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;
        
        /* Read and save an integer, double, and String to your variables.*/
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine(); // read the rest of the line of input (newline character after the double token).
        s2 = scan.nextLine();
       
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d2);
      
        /* Concatenate and print the String variables on a new line integer variables on a new line; 
           the 'string` variable above should be printed first. */
        System.out.println(s + s2);
        
        scan.close();
   }
}
 
 ```
