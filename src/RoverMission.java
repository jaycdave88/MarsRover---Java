
public class RoverMission {

	private static FileParserIO rFile;
	private static Rover rover;
	private static UserInterface ux;

	public static void main(String[] args) {
		
		ux = new UserInterface();
		String filePath = ux.filePath();
		
		rFile = new FileParserIO();
		rover = new Rover();

		rFile.openFile(filePath);
		rFile.readFile();
		rFile.closeFile();

		rover.moveLeft("S");
		rover.moveRight("N");
	}

}
