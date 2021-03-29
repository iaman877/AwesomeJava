//  CLASS IMPLEMENTS ONE INTERFACE
interface printable
{
 void print(); //by default public and abstract
}

 class A implements printable
 {
  public void print()//overridden method
   {
    System.out.println("Hello");
   }

 public static void main(String args[])
  {
     //printable obj = new printable ();
     //A a=new A(); 
     printable obj = new A ();
    obj.print();
  }
 } 
 
// TWO CLASSES IMPLEMENTS ONE INTERFACE
 interface Drawable
 {
 void draw();
 }

 class Rectangle implements Drawable
 {
   public void draw()       //overridden
    {
      System.out.println("drawing rectangle");
    }
 }
 class Circle implements Drawable
 {
 public void draw()    //overridden
   {
       System.out.println("drawing circle");
   }
 }
 class TestInterface
 {
 public static void main(String args[])
 {
    Drawable d=new Circle();
    Drawable e =new Rectangle();
     d.draw();
     e.draw();
  }
 }
