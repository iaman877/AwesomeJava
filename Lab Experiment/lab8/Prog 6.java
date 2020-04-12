import java.util.Arrays;
import java.util.List;
public class Wrapper2
{ 
    public static void main(String args[])
     {
         String decimal = "100.25"; 
         float f = Float.parseFloat(decimal); 
         System.out.println("float equvialent of String " + decimal + " is : " + f);
         f = Float.parseFloat("200");
         System.out.println("String 200 in float is : " + f);
         String pie = "3.14"; 
         float number = Float.valueOf(pie); 
         System.out.println(pie + " in float is : " + number);
         String multiplier ="1.5"; 
         float constant = new Float(multiplier); 
         System.out.println("String '1.5' is equal to float : " + constant);
         float quarter = .25f; 
         String fromFloat = "" + quarter; 
         System.out.println("float " + f + " is converted to String : " + fromFloat);
         Float half = Float.valueOf(.5f); 
         String str = half.toString(); 
         System.out.println("Float " + half + " is converted to String : " + str);
         float onethird = .75f;
         String floatingpoint = String.valueOf(onethird); 
         System.out.println("float " + onethird + " is equal to String : " + floatingpoint);

     }
}
