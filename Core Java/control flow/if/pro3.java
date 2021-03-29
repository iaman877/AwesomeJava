public class Main {    
public static void main(String[] args) {    
    int year=2018;    
    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
        System.out.println("Leap YEAR");  
    }  
    else{  
        System.out.println("not a  YEAR");  
    }  
 }    
}
