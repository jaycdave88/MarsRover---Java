
public class Rover {
	
public void moveRight(String rightMove){
	
	switch (rightMove){
		case "N":
			rightMove = "E";
			break;
		case "E":
			rightMove = "S";
			break;
		case "S":
			rightMove = "W";
			break;
		case "W":
			rightMove = "N";
			break;
		default:
			System.out.println("Error in moveRight()");
		}//end switch
//		System.out.print("The output is moveRight(): " + rightMove);
}// end moveRight
	
	public void moveLeft(String leftMove){
		switch (leftMove){
		case "N":
			leftMove = "W";
			break;
		case "E":
			leftMove = "N";
			break;
		case "S":
			leftMove = "E";
			break;
		case "W":
			leftMove = "S";
			break;
		default:
			System.out.println("Error in moveLeft");
		}// end leftMove
//		System.out.print("The output for moveLeft(): " + leftMove);
	}//move left
	
	
}// end Rover Klass
