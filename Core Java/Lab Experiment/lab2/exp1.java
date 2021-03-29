// WAP for  10 student marks in an array[] , arrange them into in assening order , convert into the fallowing grade .   
 import java.util.*;
 import java.lang.*;
 import java.io.*;
public class Main
{
    public static void main(String[] args) 
    {
        int n, temp, i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for ( i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for ( i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for ( i = 0; i < n ; i++) 
        {
            System.out.print(a[i] + ",");
        }
       // System.out.print(a[n - 1]);
  
     for ( i = 0; i < n; i++)
      {
       if(a[i]<50)
         System.out.println("Fail");
      }
       for ( i = 0; i < n; i++) 
   	{
      if(a[i]>50 && a[i]<70)
         System.out.println("Pass ");
      }
      for ( i = 0; i < n; i++) {
      if(a[i]>70)
         System.out.println("Distinction");
      }
     }
    
}
