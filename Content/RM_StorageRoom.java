
public class RM_StorageRoom extends Room{
	
	//Create a new instance of RM_StorageRoom
	//Chapter 1- #6 Proper use of the Final Keyword.
	private static final RM_StorageRoom instance = new RM_StorageRoom();
	
	//Create a constructor of the RM_StorageRoom class
	private RM_StorageRoom() {
		InitRoom();
	}
	
	//Create GetInstance() to return instance of RM_StorageRoom
	//Chapter 1- #5 Proper use of the Static Keyword.
	public static RM_StorageRoom GetInstance() {
		return instance;
	}

	@Override
	public void InitRoom() {
		title = "Storage Room";
		description = "A room is filled with boxes.";
		
		objectsSouth = new Object[1];
		objectsSouth[0] = new OBJ_HallwayStorageDoor();
		
		objectsNorth = new Object[2];
		objectsNorth[0] = new OBJ_Cage();
		objectsNorth[1] = new OBJ_MakeupKit();
	}
}
