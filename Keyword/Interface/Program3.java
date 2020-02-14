/*
1)	Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. 
Create one new class called ToTestInt. In this class use the object of arithmetic class.    */

interface test
{
    int square();
}
class airthmatic implements test
{
    int b;
    airthmatic(int x)
       {
           b = x;
       }
    public int square()
    {
        return (b*b);
    }
}
class TotestInt
{
    public int print(int x)
    {
        airthmatic a = new airthmatic(x);
         return a.square();
    }
}
class Interface1
{
    public static void main(String args[])
     {
         TotestInt x = new TotestInt();
           System.out.println("the square of 4 is "+x.print(4));
     }  
}
