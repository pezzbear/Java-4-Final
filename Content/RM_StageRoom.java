//Utilize singleton design pattern to create RM_StageRoom
public class RM_StageRoom extends Room{
	
	//Create a new instance of RM_StageRoom
	private static final RM_StageRoom instance = new RM_StageRoom();

	//Create a constructor of the RM_StageRoom class
	private RM_StageRoom() {
		InitRoom();
	}
	
	//Create GetInstance() to return instance of RM_StageRoom
	public static RM_StageRoom GetInstance() {
		return instance;
	}
	
	@Override
	public void InitRoom() {
		title = "Stage Room";
		description = "A room with a stage and a door on each of the four walls.";
		
		//Can check these
		//Emily
		
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
