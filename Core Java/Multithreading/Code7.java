class MyThreadEx extends Thread
 {
   //not override run() method.
 }
class NoOverride
 {
   public static void main(String arg[])
     {
       MyThreadEx t1=new MyThreadEx();
       t1.start();
     }
  }
