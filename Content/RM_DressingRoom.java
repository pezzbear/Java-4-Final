
public class RM_DressingRoom extends Room{
	
	private static final RM_DressingRoom instance = new RM_DressingRoom();
	
	private RM_DressingRoom() {
		InitRoom();
	}
	
	public static RM_DressingRoom GetInstance() {
		return instance;
	}
	
	@Override
	public void InitRoom() {
		title = "Dressing Room";
		description = "A room that looks like a regular dressing room.";
		
		objectsSouth = new Object[1];
		objectsSouth[0] = new OBJ_FancyMirror();
		
		objectsEast = new Object[1];
		objectsEast[0] = new OBJ_DressingHallwayDoor();
	}

}
