// split function is return type string
import java.io.*; 
import java.lang.*; 

class Main { 
	public static void main(String[] args) 
	{ 
		String cars = "Hyundai,Maruti,Swift,Wagnor,Ferrari";
		String all[]=  cars.split(",");
		for(String car: all)
		{
		    System.out.println(car);
		}
	} 
}  
