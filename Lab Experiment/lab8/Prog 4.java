// Write a program in Java to create a String object. Initialize this object with your name. Find the length of your name using the appropriate String method. Find whether the character ‘a’ is in your name or not; if yes find the number of times ‘a’ appears in your name. Print locations of occurrences of ‘a’ .Try the same for different String objects


class check
{
String name;
check(String n)
  { 
      name=n; 
  } 
void disp()
{
     System.out.println("Enter your name  :"+name);
     int c=0;
    int len=name.length();
    for(int i=0;i<len;i++)
    if(name.charAt(i)=='A'||name.charAt(i)=='a')
        { 
            c++;
            System.out.println("Number of time a occurance :"+c); 
            System.out.println("at index  :"+(i));
       }
   if(c==0)
       System.out.println("Sorry !! There is no 'A' in the string");
  }
}
class Aman4
{
   public static void main(String ar[])
     {
       check d1=new check("Vishal"); 
       d1.disp();
       check d2=new check("Bhilo"); 
       d2.disp();
      }
}
