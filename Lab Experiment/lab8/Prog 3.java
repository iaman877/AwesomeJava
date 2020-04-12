import java.util.*;
class Aman3
{
public static void main(String args[])
{
StringBuffer str= new StringBuffer();
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string buffer");
str.append(sc.nextLine());
String str1 = str.toString();
String str2=str1.toUpperCase();
System.out.println("\nThe converted string buffer input  in capital letters string is:"+str2);
}
}
