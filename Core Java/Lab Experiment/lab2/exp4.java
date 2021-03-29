import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
 public static void main(String[] args) 
  {
      System.out.println("Enter the 3 numbers");
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();
     int[] input = { 9, 4, 5 };
      for (int x = 0; x < 3; x++)
       {
          for (int y = 0; y < 3; y++) 
             {
                 for (int z = 0; z < 3; z++) 
                    {
                        if (x != y && y != z && z != x) 
                            {
                                System.out.println(input[x] + "" + input[y] + "" + input[z]);
                            }
                    }
             }
        }
  }
}
