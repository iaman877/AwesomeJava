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
