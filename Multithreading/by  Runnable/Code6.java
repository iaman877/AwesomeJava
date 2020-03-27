class Mythread1 implements Runnable 
{
  public void run() 
  {
     for(int i=1;i<11;i++)
       {
          System.out.println("Running Thread1:"+i);
        }
  }
}
class Mythread2 extends Thread 
{
  public void run()
   {
     for(int i=11;i<21;i++)
       {
          System.out.println("Running Thread2:"+i);
        }
   }
}
class Mythread3 extends Thread 
{
  public void run()
   {
     for(int i=21;i<31;i++)
       {
          System.out.println("Running Thread3:"+i); 
       }
    }
}
class JoinThread 
{
    public static void main(String arg[])
     {
        Mythread1 r1=new Mythread1();
        Thread t1=new Thread(r1,"thread1");
        t1.start();
        try{
              t1.join();     //it force to complete the task of t1 thread.
           }
           catch(Exception e)
           {
             System.out.println(e);
           }
       Mythread2 t2=new Mythread2();
       t2.start();
       Mythread3 t3=new Mythread3();
       t3.start();
     }
}
