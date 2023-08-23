package Task;

public class Test{

	public void demo()
	{
		System.out.println(" ,,,,,,,,");
	}
	
	public void demo2()
	{
		System.out.println("jhvutjv");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {

		
	    Test obj = new Test();
		
		obj.demo();
		
		Test bcc = (Test)obj.clone();
		bcc.demo2();
		
		
		
		
		
		
	}

}