import java.util.*;
class Main 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s,piglatin="";
    s=sc.nextLine();
    s=s.toUpperCase();
    int flag=0;
    int length=s.length();
    int i;
    char ch;
    
    for(i=0;i<length;i++)
    {
      ch=s.charAt(i);
      if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
        piglatin=s.substring(i)+s.substring(0,i)+"AY";
        flag=1;
        break;
      }
    }
    
    if(flag!=1)
    {
      piglatin=s+"AY";
    }
    
    System.out.println(piglatin);
  }
}
