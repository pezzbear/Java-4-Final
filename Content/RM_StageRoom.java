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
		
		//These have not been changed.  
		//Need explanation on which door is which for each direction
		//Emily
		
		//objectsNorth = new Object[1];
		//objectsNorth[0] = new OBJ_HallwayStorageDoor();
		
		//objectsEast = new Object[1];
		//objectsEast[0] = new OBJ_HallwayStageDoor();
		
		//objectsWest = new Object[1];
		//objectsWest[0] = new OBJ_DressingHallwayDoor();
	}
}
