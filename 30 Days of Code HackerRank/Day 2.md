# Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

##  Input Format

There are  lines of numeric input:
* The first line has a double, metalCost (the cost of the meal before tax and tip).
* The second line has an integer, tipPercent (the percentage of  being added as tip).
* The third line has an integer, taxPercentage (the percentage of  being added as tax).
## Output Format

Print the total meal cost, where totalCost  is the rounded integer result of the entire bill metalCost( with added tax and tip)
## Sample Input

* 12.00
* 20
* 8
##  Sample Output

* 15

```
import java.util.*;

public class Day2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double mealPrice = sc.nextDouble();
        int tipPercentage = sc.nextInt();
        int taxPercentage = sc.nextInt();
        
        sc.close();
        
        double price = mealPrice + ((double)tipPercentage/100 * mealPrice) + ((double)taxPercentage/100 * mealPrice);
        
        int total = (int) Math.round(price);
        
        System.out.println(total );
    }
}

}

```
