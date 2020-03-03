class NestedTry
{
   public static void main(String args[])
     {
	   try
        {
		  try
		    {
			  System.out.println("Division of number occurs ");
			    int b = 23/0;
			}
			catch(ArithmeticException e)
			 {
				 System.out.println(e);
			 }
			try
			 {
				 int a[] = new int[5];
                  a[5] = 4;
			 }
			catch(ArrayIndexOutOfBoundsException e)
			 {
				System.out.println(e);
		     }	
        }
        catch(Exception e)
		{
		   System.out.println("It handle all type of exceptions");
           System.out.println(e);
        }			
	 }
}
