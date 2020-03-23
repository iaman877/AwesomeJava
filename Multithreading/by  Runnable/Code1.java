 class Main implements Runnable
{
    public void run()
     {
        System.out.println("thread is running...");
     }
   public static void main(String args[])
   {
     Main r=new Main();
     Thread t =new Thread(r);
     t.start();
    }
}
// output is : thread is running 
