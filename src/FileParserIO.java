import java.io.*;
import java.util.*;

public class FileParserIO {

	private Scanner fileData;
	private String dummbyData = "Jay Is cool";
	
		public void openFile(String filePath){
			try{
				fileData = new Scanner(new File(filePath));
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
		
		public void closeFile(){
			fileData.close();
		}//end closeFile
		
		
}// end FileParserIO
