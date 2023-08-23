package DesignPatterns;

public class SingletonMain {

	
	public static void main(String args[])    
	   {
	       Singleton a = Singleton.getInstance();
	       Singleton b = Singleton.getInstance();
	       
	       a.x = a.x + 10;  //calling static int and adding by 10
	       
	       System.out.println("Value of a.x = " + a.x);
	       System.out.println("Value of b.x = " + b.x);
	   }    
	
	
	
}
