
public class RM_DressingRoom extends Room{
	
	//Create a new instance of RM_DressingRoom
	//Chapter 1- #6 Proper use of the Final Keyword.
	private static final RM_DressingRoom instance = new RM_DressingRoom();
	
	//Create a constructor of the RM_DressingRoom class
	private RM_DressingRoom() {
		InitRoom();
	}
	
	//Create GetInstance() to return instance of RM_DressingRoom
	//Chapter 1- #5 Proper use of the Static Keyword.
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
		objectsEast[0] = new OBJ_HallwayDressingDoor();
	}

}
