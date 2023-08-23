package Basic;

import java.util.Arrays;

public class SortingString {

	// function to print string in sorted order 
    static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
  
// Driver program to test above function 
    public static void main(String[] args) {
        String s = "jaishreeram";
        sortString(s);
    }
    
    
    
    
}
