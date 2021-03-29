public class Testtycatch3
{
   public static void main(String args[])
     {
	    try 
		  {
			  int a[] = new int[5];
			  a[5] = 30/0;     // throw xxxxx Exception
		  }
		  catch(ArithmeticException e)
		   {
		     System.out.println(e);
		   }
		catch(ArrayIndexOutOfBoundsException e)
		   {
		     System.out.println(e);
		   }
		   catch(Exception e)
		   {
		     System.out.println("Catch all  the exception");
		   }
		System.out.println("rest of the code");
	 }
}

// output : Catch ArithmeticException
