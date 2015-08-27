import java.util.Scanner;

public class UserInterface {
	
	public String filePath(){
	String fileData;
	
	Scanner userInput = new Scanner(System.in);
	System.out.println("Please provide a file path:");
	fileData = userInput.nextLine();
	fileData = fileData.trim();
	
	return fileData;
	}

}
