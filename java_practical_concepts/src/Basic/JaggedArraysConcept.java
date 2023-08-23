package Basic;

public class JaggedArraysConcept {
	
	/**
	 *    Arr[2][] -> 0,1 (rows)
	 *    
	 *                    (coloumns)
	 *             0 ---> 0,1,2,3,4
	 *             1 ---> 0,1,2,3,4,5,6,7
	 * 
	 * 
	 * @author Sai 
	 */

	 public static void main(String[] args)
	    {
	        // Declaring 2-D array with 2 rows
	        int arr[][] = new int[2][];
	 
	        // Making the above array Jagged
	 
	        // First row has 3 columns
	        arr[0] = new int[5];
	 
	        // Second row has 2 columns
	        arr[1] = new int[8];
	 
	        // Initializing array
	        int count = 0;
	        for (int i = 0; i < arr.length; i++)
	            for (int j = 0; j < arr[i].length; j++)
	                arr[i][j] = count++;
	 
	        // Displaying the values of 2D Jagged array
	        System.out.println("Contents of 2D Jagged Array");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++)
	                System.out.print(arr[i][j] + " ");
	            System.out.println();
	        }
	    }
}
