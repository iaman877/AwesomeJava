// Write a program for searching strings for the first occurrence of a character or substring and for the last occurrence of a character or substring. 


import java.io.*;
class Aman1
 {
   public static void main(String[]args) throws Exception
    {
       int len1,len2,last=0;
       DataInputStream in=new DataInputStream(System.in); 
       System.out.println("Enter your string:");
       String obj1=in.readLine(); System.out.println("Enter substring for searching :"); 
       String obj2=in.readLine();
       len1=obj1.length(); 
       len2=obj2.length();
       for(int i=0;i<=(len1-len2);i++)
        {
           if(obj1.substring(i,len2+i).equals(obj2))
              {
                 if(last==0)
                    System.out.println("First occurrence of char 's'" + " is found at : " +(i)); 
                     last=i+1;
              }
        }
           if(last!=0)
                System.out.println("Last occurrence of char 's' is" + " found at : " +last);
            else
                System.out.println("the string is not found");
    }
}
