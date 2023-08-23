package Oops;

public class Polymorphism2 extends Polymorphism1 {

	@Override
	public void Add(int x, int y)
	{
		System.out.println("Addition of "+x+ " and " +y+ " is : "+(x+y));

	}
	
	public static void main(String[] args) {
		Polymorphism2 obj = new  Polymorphism2();
		obj.Add(10, 10);
	}
	
}
