//Utilize singleton design pattern to create RM_BalloonRoom
public class RM_BalloonRoom extends Room{
	
	//Create new instance of RM_BalloonRoom
	private static final RM_BalloonRoom instance = new RM_BalloonRoom();

	//Create a constructor of the RM_BalloonRoom class
	private RM_BalloonRoom() {
		InitRoom();
	}
	
	//Create GetInstance() to return instance of RM_BalloonRoom
	public static RM_BalloonRoom GetInstance() {
		return instance;
	}
	
	@Override
	public void InitRoom() {
		title = "Balloon Room";
		description = "It's filled to the ceiling with balloons! Inside there is a lever to open a room,"
				+ "a button that opens a locked crate, which is also hidden in this room. There is also a door."; 
		
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
