class MyThread1 extends Thread
{
   public void run()
   {
    for (int i=1;i<=10;i++)
     {
        System.out.println("Running Thread1:"+i);
     }
   }
}
class MyThread2 extends Thread
{
    public void run()
     {
         for(int i=11;i<=20;i++)
            {
                System.out.println("Running Thread2:"+i);
            }
     }
}
class Main
{
  public static void main(String arg[])
   {
     MyThread1 mt1=new MyThread1();
     mt1.run(); //1-10
     MyThread2 mt2=new MyThread2();
     mt2.run();//11-20
   }
}
