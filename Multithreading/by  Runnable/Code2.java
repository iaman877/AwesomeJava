class Main implements Runnable
{
  public void run()
   {
     for(int i=1;i<=10;i++)
       {
        System.out.println("child thread is running..."+i);
       }
    }
    public static void main(String args[])
    {
      Main r=new Main();
      Thread t =new Thread(r);
      t.start();
      for(int i=11;i<=20;i++)
       {
            System.out.println("main thread is running..."+i);
       }
   }
}
    
// you will get mixed output in between 1 to 20
