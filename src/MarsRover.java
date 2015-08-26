
public class MarsRover {

	private static FileParserIO rFile;
	private static Rover rover;

	public static void main(String[] args) {
		
		rFile = new FileParserIO();
		rover = new Rover();

		rFile.openFile();
		rFile.readFile();
		rFile.closeFile();

		rFile.createAndAdd();
		
		rover.moveLeft("S");
		rover.moveRight("N");
	}

}
