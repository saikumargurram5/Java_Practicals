package Oops;

public class Oops1 {

	/**
	 *  Program to understand Class, Object, Methods, Method Passing
	 * 
	 */
	
	
	
	static String Employee_name;
    static float Employee_salary;
  
    static void set(String n, float p) {
        Employee_name  = n;
        Employee_salary  = p;
    }
  
    static void get() {
        System.out.println("Employee name is: " +Employee_name );
        System.out.println("Employee CTC is: " + Employee_salary);
    }
  
    public static void main(String args[]) {
    	Oops1.set("India Is My Country", 10000.0f);
    	Oops1.get();
    }
	
	
}
