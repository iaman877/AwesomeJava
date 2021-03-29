//Write a program in Java to read a statement from console, convert it into upper case and again print on console. (Don’t use inbuilt function) 


 import java.io.*; 
class  Aman2
{
   public static void main(String a[]) throws IOException
    {
      DataInputStream in=new DataInputStream(System.in); 
      System.out.println("Enter the string ");
      String s1=in.readLine();
      System.out.println("upper case of String  "+s1.toUpperCase());
  }
}
