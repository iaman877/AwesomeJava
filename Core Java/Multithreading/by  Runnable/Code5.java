class MultiStart extends Thread
{
  public void run()
   {
     System.out.println("thread is running...");
   }
   public static void main(String args[])
   {
    MultiStart t1=new MultiStart();
    t1.start();
    t1.start();
  }
}

// we will get IllegalThreadStateException 
