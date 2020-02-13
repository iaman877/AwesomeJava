/*  Interface methods are by default abstract and public
    Interface attributes are by default public, static and final   */
    
interface A1 {
  public void f1();      // interface methods
  public void f2();     
}
class A2 implements A1
 {
  public void f1()
  {
    System.out.println("Inside f1() in child class");
  }
  public void f2()
  {
    System.out.println("Inside f2() in child class");
  }
}
class Main {
  public static void main(String[] args) {
    A2 obj = new A2();  
    obj.f1();
    obj.f2();
  }
}

/* To implement multiple interfaces, separate them with a comma: */

interface A1
{
  public void f1();    
}

interface A2
{
  public void f2(); 
}

class A3 implements A1, A2
{
   public void f1()
   {
      System.out.println("Inside f1 in class A3");
   }
  public void f2()
  {
    System.out.println("inside f2 in class A3");
  }
}
class Main {
  public static void main(String[] args) {
    A3 Obj = new A3();
    Obj.f1();
    Obj.f2();
  }
}
