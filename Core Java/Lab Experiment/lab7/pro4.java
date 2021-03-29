import java.io.*;
class IOT extends Exception
{
IOT(String s)
{
super(s);
}
}
class Every
{
public static void main(String arg[])
{
String direction1=null,direction2=null;
try
{
DataInputStream in= new DataInputStream(System.in);
System.out.println("In which direction vehicle1 is to going :");
direction1=in.readLine();
System.out.println("In which direction vehicle2 is to going :");
direction2=in.readLine();
if(!direction1.equals(direction2))
throw new IOT("truck2 has to go on "+ direction1 +" direction");
}
catch(IOT e)
{
System.out.println(e);
direction2=direction1;
System.out.println("Danger !! STOP STOP Collision will take place");
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("vehicle1 is going " +direction1 +" Side");
System.out.println("vehicle2 is going " +direction2 +" Side");
}
}
