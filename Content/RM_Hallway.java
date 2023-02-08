
public class RM_Hallway extends Room{
	private static final RM_Hallway instance = new RM_Hallway();
	
	private RM_Hallway() {
		InitRoom();
	}

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
		objectsWest[0] = new OBJ_DressingHallwayDoor();
	}
}
