class MyThreadEx1 extends Thread
{
public void start()
{
System.out.println("start method");
}
public void run()
{
System.out.println("run method");
}
}
class TestStart
{
public static void main(String args[])
{
MyThreadEx1 t=new MyThreadEx1();
t.start();
System.out.println("main method");
}
}
// output 
// start method 
// main method 
