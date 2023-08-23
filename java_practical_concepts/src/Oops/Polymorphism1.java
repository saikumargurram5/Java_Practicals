package Oops;

public class Polymorphism1  {

	
	public void Add(int x, int y)
	{
		System.out.println("Addition of "+x+ " and " +y+ " is : "+(x+y));
	}
	
	public void Add(int x, int y, int z)
	{
		System.out.println("Addition of "+x+ " and " +y+ " and " +z+ " is :" +(x+y+z));
	}
	
	
	public static void main(String[] args) {
		new Polymorphism1().Add(10, 20);
		new Polymorphism1().Add(10, 20, 30);
	}
	
	
	
}
