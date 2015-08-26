import java.io.*;
import java.util.*;

public class FileParserIO {

	private Scanner fileData;
	private String dummbyData = "Jay Is cool";
	
		public void openFile(){
			try{
				fileData = new Scanner(new File("data_test.txt"));
			} 
			catch(Exception e){
				System.out.println("Looks like I could not find the file, please check path and try again.");
			}// end try
		}// end openFile
		
		public void readFile(){
	
			while(fileData.hasNext()){
				String num = fileData.next();
				String FName = fileData.next();
				String LName = fileData.next();
				System.out.printf("%s,%s,%s\n",num,FName,LName);
			}// end while-loop

		}//end readFile
	
		public void createAndAdd(){
			 BufferedWriter writer = null;
			    try {
			        writer = new BufferedWriter(new FileWriter("./output.txt"));
			        writer.write(dummbyData);
			    } catch (IOException e) {
			    	System.out.println("There was a error in creating the file.");
			        System.err.println(e);
			    } finally {
			        if (writer != null) {
			            try {
			                writer.close();
			            } catch (IOException e) {
			            	System.out.println("There was a error in closing the file.");
			                System.err.println(e);
			            }
			        }
			    }
		}//end createAndAdd
		
		public void closeFile(){
			fileData.close();
		}//end closeFile
		
		
}// end FileParserIO
