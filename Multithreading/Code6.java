class MyThreadEx extends Thread
{
  public void run()
    {
      System.out.println("No argument run method:);
    }
  public void run(int i)
    {
       System.out.println("int argument run method:);
    } 
}
class TestOverload
{
  public static void main(String arg[])
   {
     MyThreadEx t1=new MyThreadEx();
     t1.start(); //
   } 
}
// Overloading of run method is possible but Thread class start() method can invoke no argument run method,
// the other overloaded method we have to call explicitly like a normal method call.
