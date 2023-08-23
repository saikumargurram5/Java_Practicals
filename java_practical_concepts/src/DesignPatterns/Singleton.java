package DesignPatterns;

public class Singleton {

	/**
	 * As the name implies, a class is said to be singleton if it limits the number of objects of that class to one.
	 */
	
	
	static Singleton instance = null;
    public int x = 10;
    
    // private constructor can't be accessed outside the class
    private Singleton() {  }
   
    // Factory method to provide the users with instances
    static public Singleton getInstance()
    {
        if (instance == null)        
             instance = new Singleton();
   
        return instance;
    } 
    
    
    
}
