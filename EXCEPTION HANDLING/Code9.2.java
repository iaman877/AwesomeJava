/* Java Custom/User Define Exception
Java custom exceptions are used to customize the exception according to user need. By the help of custom exception, you can have your own
exception and message.
The general form of creating an exception is:
(1) Throwable t = new Throwable(“my Exception”);
(2) Exception t=new Exception(“my Exception”)

Constructors:
 Throwable();
 ThrowableClass(String s);
 Exception();
 Exception (String s);

class CustomException
{
  public static void main(String args[])
   {
    Throwable t = new Throwable("CustomException");
    try
     {
      System.out.println("\n A new exception is thrown");
      throw t;
     }
    catch(Throwable e)
     {
       System.out.println("\n The exception is caught here.");
       System.out.println("\n The exception is:"+e);
     }
    }
}
//------------------------------------------------------------------------------

class CustomException
{
public static void main(String args[])
{
Exception t = new Exception("CustomException");
try
 {
 System.out.println("\n A new exception is thrown");
 throw t;
 }
catch(Exception e)
 {
 System.out.println("\n The exception is caught here.");
 System.out.println("\n The exception is:"+e);
 }
 }
}
