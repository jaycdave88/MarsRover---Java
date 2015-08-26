
public class MarsRover {

	private static FileParserIO rFile;

	public static void main(String[] args) {
		
		rFile = new FileParserIO();

		rFile.openFile();
		rFile.readFile();
		rFile.closeFile();

		rFile.createAndAdd();
	}

}
