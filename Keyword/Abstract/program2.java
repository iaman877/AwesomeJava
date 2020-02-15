abstract class parent
{
    public abstract void m1();
    public abstract void m2();
}
class TestChild extends parent
{
    public void m1()  { }
//  public void m2()  { }

    public static void main(String args[])
    {
        TestChild m = new TestChild();
        m.m1();
        m.m2();
    }  
}
    
/* >error :TestChild is not abstract and does not override abstract method m2() in parentclass TestChild extends parent
   we can handle this error either by declare child class as an abstract (case 1) or by providing implementation for m1(), m2() */
 
 case1 
  abstract class bike 
{
    abstract void run();
    void speed() {}
}
class Honda extends bike
{
    void run()
    {
        System.out.println("overide run() method ");
    }
    public static void main(String args[])
     {
        // Honda obj = new Honda();          both the object will give sane outputs
            bike obj = new Honda();
         obj.run();
     }
}
