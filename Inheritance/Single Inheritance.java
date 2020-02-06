import java.util.*; 
import java.lang.*; 
import java.io.*; 
class Player 
{ 
     void print_geek() 
	{ 
		System.out.println("Player"); 
	} 
} 
class Cricket_player extends Player
{ 
      void print_for1() 
	{ 
		System.out.println("A1"); 
	} 
} 
class Hockey_player extends Player
{ 
     void print_for2() 
	{ 
		System.out.println("A2"); 
	} 
}
class Football_player extends Player
{ 
     void print_for3() 
	{ 
		System.out.println("A3"); 
	} 
}
public class PP
{ 
	public static void main(String[] args) 
	{ 
		Football_player g = new Football_player(); 
		g.print_geek(); 
                g.print_for3();
                Cricket_player g1 = new Cricket_player(); 
         	g1.print_for1();
                Hockey_player  g2 = new Hockey_player();
		g2.print_for2();
	} 
}
