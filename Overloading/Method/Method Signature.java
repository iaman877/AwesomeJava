class MSignature 
{
   public void meth1(int i)
      {
          System.out.println("Method 1");
      }
  public void meth2(String s)
     {
         System.out.println("Method 2");
     }
    public static void main(String args[])
   {
       MSignature m = new MSignature();
                 m.meth1(14);
                 m.meth2("Aman");
  }
}
