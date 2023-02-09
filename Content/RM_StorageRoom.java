
public class RM_StorageRoom extends Room{
	private static final RM_StorageRoom instance = new RM_StorageRoom();
	
	private RM_StorageRoom() {
		InitRoom();
	}
	
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
