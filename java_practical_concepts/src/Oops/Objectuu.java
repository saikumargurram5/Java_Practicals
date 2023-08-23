package Oops;

public class Objectuu {
	static int rollno = 100;
	int roll;
	
	Objectuu()
	{
		roll = rollno;
		rollno++;
	}
	 @Override public int hashCode() { return rollno; }
	 
	 //For Garbage Collector Clean Up Memory
	 @Override protected void finalize()
	    {
	        System.out.println("finalize method called");
	    }
	 
	 
	public static void main(String[] args) {

	Objectuu s = new Objectuu();
	Objectuu s1 = new Objectuu();
	
		// toString() method
		System.out.println(s.toString());
		
		//hashCode() 
		System.out.println(s.hashCode());
		
		
		//equals()
		if(s.equals(s1))
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
		
		
		//getClass()
		System.out.println(s.getClass());
		
		
		
		//finalize
		s1 = null;
		System.gc();
		
		
		
		
		
		
		
	}

	
	
}
