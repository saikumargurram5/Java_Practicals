package Task;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {

	public  void main() 
{

			  String path = "C:\\Users\\91996\\Desktop\\definations C";
			  //Creating a File object for directory
		      File directoryPath = new File(path);
		      System.out.println("Opening local Directory : " +path);
		      System.out.println(" ");

	      
			      //List of all files and directories
			      File filesList[] = directoryPath.listFiles();
			      System.out.println("List of files in the specified directory:"); System.out.println(" ");
			      
	      
				      for(File file : filesList) 
				      {
				         String fname = file.getName();
				         System.out.println(" ");
				         SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm");
				         String LMDate= format.format(file.lastModified());
				         String arr[] = LMDate.split(" ", 2);
					     String temp = arr[0];
					     
						 SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
			             Date dt = new Date();
			             String today = form.format(dt);
			             
			            
			           
			             if(temp.matches(today))
			             {
			            	 System.out.println("File Exist");
			            	 System.out.println("File name: "+fname+" is the latest and date modified is: "+LMDate);
			             }
			             
					  }
				      
             
             
             
             
             
				      
				      
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}