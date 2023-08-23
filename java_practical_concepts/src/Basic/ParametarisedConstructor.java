package Basic;

public class ParametarisedConstructor {

	 // data members of the class.
    String name;
    int id;
    
    /**
     *  Parameterised Constructer
     */
    ParametarisedConstructor(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    
    
    
    
	/**
	 *  Copy Constructor
	 */
    
    
    ParametarisedConstructor(ParametarisedConstructor objjj)
    {
    	this.name = objjj.name;
        this.id = objjj.id;
    }
    
    
    
    
    
    
    
    
}


