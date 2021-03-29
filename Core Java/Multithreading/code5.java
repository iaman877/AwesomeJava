class MyThread extends Thread
{
  public void run()     //overridden method
   {
    for(int i=1;i<=10;i++)
     {
      System.out.println("Child Thread is running:"+i);
    }
  }
} 
class Test
{
  public static void main(String args[])   //main thread
  {
    MyThread mt=new MyThread();//thread instance creation ,main thread create a child thread object
     mt.run();//main thread start child thread, child thread is responsible to execute run()method line(5-8)after start metho two thread are there
    for(int j=11;j<=20;j++)
    {
      System.out.println("Main Thread is running:"+j);  //main thread is responsible to run remaining code
    }
 }
}
// both jobs are going be to be executed simultaneously, we wil
