public class Testtycatch2
{
   public static void main(String args[])
     {
	    try 
		  {
			  a[5] = 30/0;  // it will throw an object of class ArithmeticException
		  }
		   catch(AirthException e)  // or catch(Exception e)
		   {
		     System.out.println(e);
		   }
		System.out.println("rest of the code");
	 }
}
