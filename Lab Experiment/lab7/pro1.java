1. Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program.

import java.io.*; 
class student
{
      String name,grade;
      int reg,m1,m2,m3;
      void read()throws  Exception
       {
          DataInputStream in= new DataInputStream(System.in);
          System.out.println("enter the register no : "); 
          reg=Integer.parseInt(in.readLine()); 
          System.out.println("enter the name : ");
          name=in.readLine();
          System.out.println("enter mark1 : ");
          m1=Integer.parseInt(in.readLine());
          System.out.println("enter mark2 : ");
          m2=Integer.parseInt(in.readLine());
          System.out.println("enter mark3 : ");
          m3=Integer.parseInt(in.readLine());
       }
public void disp_grade()
 {
     int tt=m1+m2+m3; 
     if(tt>=250) grade="A";
     else if(tt>=200) grade="B"; 
     else if(tt>=150) grade="C";
     else if(tt>=100) grade="D";
     else grade="E";
     System.out.println("Grade :"+grade);
}
void disp()
{
     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     System.out.println(" MARK LIST OF STUDENTS "); 
     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
     System.out.println("Register No :"+reg);
     System.out.println("Name :"+name);
     System.out.println("Mark1 :"+m1);
     System.out.println("Mark2 :"+m2);
     System.out.println("Mark3 :"+m3);
     disp_grade();
 }
}
class Main
{
  public static void main(String ar[])
  {
    int no=0;
    student s=new student(); 
    try
     {
        DataInputStream in= new DataInputStream(System.in);
        System.out.println("enter the number of students : "); 
        no=Integer.parseInt(in.readLine());
        for(int i=0;i<no;i++);
        s.read();
     }
    catch(ArrayIndexOutOfBoundsException    e)
     {
       System.out.println("the maximum students should be ten\n");
       no=10;
    }
    catch(Exception e)
    { 
        System.out.println(e);
    }
    for(int i=0;i<no;i++)
     s.disp();
}
}
// another method 
import java.io.*; 
class IOT
{
      String x;
      int p;
      void read()throws  Exception
       {
          DataInputStream in= new DataInputStream(System.in);
          System.out.println("\n  --------- Enter the Student  detail --------- "); 
          System.out.println("Enter the name : ");
          x=in.readLine();
          System.out.println("Enter the your SAPID  : "); 
          p=Integer.parseInt(in.readLine()); 
       }

void show()
{
     System.out.println("\n  --------- Students detail --------- "); 
     System.out.println("Name   :"+x);
     System.out.println("SAPID  :"+p);
 }
}
class Main
{
  public static void main(String arg[])
  {
     System.out.println("My Name : Aman Bhardwaj && Roll no : 09 ");
    int no=0;
    IOT s=new IOT(); 
    try
     {
        DataInputStream in= new DataInputStream(System.in);
        System.out.println("Enter the number of students : "); 
        no=Integer.parseInt(in.readLine());
        if(no>10)
          {
             throw new ArrayIndexOutOfBoundsException("You cant enter more then 10 \n");
          }
         else
         {
              for(int i=0;i<no;i++)
              {
                 s.read();
                 s.show();
              }
              
         }
     }
    catch(Exception e)
    { 
        System.out.println(e);
    }
}
}
