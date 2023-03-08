/**
 * Class that holds the Exit Room  
 * Holds all objects in this room
 * 
 */
public class RM_ExitRoom extends Room{
	
	//Create new instance of RM_BalloonRoom
	//Chapter 1- #6 Proper use of the Final Keyword.
	private static final RM_ExitRoom instance = new RM_ExitRoom();

	//Create a constructor of the RM_BalloonRoom class
	private RM_ExitRoom() {
		InitRoom();
	}
	
	//Create GetInstance() to return instance of RM_BalloonRoom
	//Chapter 1- #5 Proper use of the Static Keyword.
	public static RM_ExitRoom GetInstance() {
		return instance;
	}
	
	@Override
	public void InitRoom() {
		title = "Exit Room";
		description = "Placeholder for the end of the game"; 
	}
}
