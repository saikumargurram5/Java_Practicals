package Basic;

public class ConstructorMain {

	
	public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        System.out.println("Parameterised Constructor");
    	ParametarisedConstructor obj = new ParametarisedConstructor("avinash", 68);
        System.out.println("GeekName :" + obj.name+ " and GeekId :" + obj.id);
        
        System.out.println(" ");
        
        // This would invoke the copy constructor.
        ParametarisedConstructor geek2 = new ParametarisedConstructor(obj);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("GeekName :" + geek2.name+ " and GeekId :" + geek2.id);
        
        
    }
	
	
	
	
}
