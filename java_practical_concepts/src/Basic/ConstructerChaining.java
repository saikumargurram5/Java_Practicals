package Basic;

/**
 * 
 * @author 91996
 * Constructor chaining is the process of calling one constructor from another constructor with 
 * respect to current object. 
 *
 */

public class ConstructerChaining {

	ConstructerChaining()
	{
		this(10);
		System.out.println(" Default Constructor");
	}
	
	
	ConstructerChaining(int x)
	{
		this(x , 5);
		System.out.println("Single Parametarised Constructor....." +x);
	}
	
	ConstructerChaining(int x, int y)
	{
		System.out.println("Double Parameterised constructor..."+(x+y));
	}
	
	
	public static void main(String[] args) {
		
		new ConstructerChaining();
		
		
		
	}
	
	
	
	
	
}
