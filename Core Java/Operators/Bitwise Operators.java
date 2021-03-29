public class Main {
  public static void main(String args[]) {

     int n1 = 11;       /* 11 = 00001011 */
     int n2 = 22;      /* 22 = 00010110 */
     int T = 0;

     T = n1 & n2;   
     System.out.println("num1 & num2: "+T);

     T = n1 | n2;   
     System.out.println("num1 | num2: "+T);
    
     T = n1 ^ n2;   
     System.out.println("num1 ^ num2: "+T);
    
     T = ~n1;   
     System.out.println("~num1: "+T);
    
     T = n1 << 2;   
     System.out.println("num1 << 2: "+T);
     T = n1 >> 2;   
     System.out.println("num1 >> 2: "+T);
  }
}
