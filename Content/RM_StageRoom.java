/**
 * Class that holds the Stage Room  
 * Holds all objects in this room
 * 
 */
public class RM_StageRoom extends Room{
	
	//Create a new instance of RM_StageRoom
	//Chapter 1- #6 Proper use of the Final Keyword.
	private static final RM_StageRoom instance = new RM_StageRoom();

	//Create a constructor of the RM_StageRoom class
	private RM_StageRoom() {
		InitRoom();
	}
	
	//Create GetInstance() to return instance of RM_StageRoom
	//Chapter 1- #5 Proper use of the Static Keyword.
	public static RM_StageRoom GetInstance() {
		return instance;
	}
	
	@Override
	public void InitRoom() {
		title = "Stage Room";
		description = "A room with a stage and a door on each of the four walls.";

		//Add Balloon room door to the Stage room
		objectsNorth = new Object[1];
		objectsNorth[0] = new OBJ_StageBalloonDoor();
		
		//Add Bicycle room door to the Stage room
		objectsEast = new Object[1];
		objectsEast[0] = new OBJ_StageBicycleDoor();
		
		//Add the Hallway door to the Stage room
		objectsWest = new Object[1];
		objectsWest[0] = new OBJ_HallwayStageDoor();
		
		//Add the Exit door to the Stage room
		objectsSouth = new Object[1];
		objectsSouth[0] = new OBJ_StageExitDoor();
	}
}
