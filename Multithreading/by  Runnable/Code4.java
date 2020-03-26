class Mythread1 implements Runnable 
{
   public void run() 
    {
      for(int i=0;i<10;i++)
       {
          try
            {
               Thread.sleep(1000); // sleeps thread for 1 sec
            }
            catch(InterruptedException e)
            {
              System.out.println(e);
            }
         System.out.println("Running Thread1:"+i); 
       }
    }
}
class Mythread2 extends Thread
{
  public void run()
   {
    for(int i=10;i<20;i++)
     {
       System.out.println("Running Thread2:"+i); 
         
     }
    }
}
class Main 
{
   public static void main(String arg[])
   {
     Mythread1 r1=new Mythread1();
     Thread t1=new Thread(r1,"thread1");
     t1.start();
     Mythread2 r2=new Mythread2();
     r2.start();
   }
}
