# Write a Java program to enable the user to handle any chance of divide  by zero exception.  

class Main
{
public static void main(String arg[])
  {
    int array[] = {10,20,30};
    int x=0,m=5,y=0; 
    try
      {
          y=m/x;
         System.out.println("The result is" +y);
         for(int i = 2; i >= 0; i--)
         {
            System.out.println("The value of array is" +array[i]);
         }
      }
    catch(ArithmeticException e)
       {
           System.out.println("Wrong !! you cant divide by 0 ");
           System.out.println("Therefore new value of v is ");
           y=2;
       }
    catch (ArrayIndexOutOfBoundsException e) 
         {
            System.out.println("Error. Array is out of Bounds"+e);
         } 
    catch(Exception e)
         {
             System.out.println(e);
         }
       System.out.println("Result :"+y);
  }
}
