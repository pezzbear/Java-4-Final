/**
 * Class that holds the Hallway Room  
 * Holds all objects in this room
 * 
 */
public class RM_Hallway extends Room{
	
	//Create a new instance of RM_Hallway
	//Chapter 1- #6 Proper use of the Final Keyword.
	private static final RM_Hallway instance = new RM_Hallway();
	
	//Create a constructor of the RM_Hallway class
	private RM_Hallway() {
		InitRoom();
	}

	//Create GetInstance() to return instance of RM_Hallway
	//Chapter 1- #5 Proper use of the Static Keyword.
	public static RM_Hallway GetInstance() {
		return instance;
	}
	
	@Override
	public void InitRoom() {
		title = "Hallway";
		description = "A dark room filled with doors.";
		
		objectsNorth = new Object[1];
		objectsNorth[0] = new OBJ_HallwayStorageDoor();
		
		objectsEast = new Object[1];
		objectsEast[0] = new OBJ_HallwayStageDoor();
		
		objectsWest = new Object[1];
		objectsWest[0] = new OBJ_HallwayDressingDoor();
	}
}
