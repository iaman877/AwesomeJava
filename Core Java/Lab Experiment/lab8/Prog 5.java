// Write a Java code that converts int to Integer, converts Integer to String, converts String to int, converts int to String, converts String to Integer converts Integer to int.


class Wrapper1
{ 
public static void main(String args[]) 
{ 
    int i = 10;
    Integer intObj = new Integer(i);
    System.out.println("int equvialent to  Integer = " +intObj);
	int a = 1234; 
	String str1 = Integer.toString(a); 
	System.out.println("Integer equvialent to  String  = " + str1); 
	 String s = "100";
    try
    {
      int j = Integer.parseInt(s.trim());
      System.out.println("String equvialent to int = " + j);
    }
    catch (NumberFormatException nfe)
    {
      System.out.println("NumberFormatException: " + nfe.getMessage());
    }
     int intParam = 1001;
     String strValue1 = String.valueOf(intParam);
     System.out.println("int equvialent to String = " +strValue1);
 } 
}
