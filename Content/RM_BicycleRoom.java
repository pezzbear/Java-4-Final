//Utilize singleton design pattern to create RM_BicycleRoom
public class RM_BicycleRoom extends Room{
	
	//Create a new instance of RM_BicycleRoom
	private static final RM_BicycleRoom instance = new RM_BicycleRoom();

	//Create a constructor of the RM_BicycleRoom class
	private RM_BicycleRoom() {
		InitRoom();
	}
		
	//Create GetInstance() to return instance of RM_BicycleRoom
	public static RM_BicycleRoom GetInstance() {
		return instance;
	}
	
	@Override
	public void InitRoom() {
		title = "Bicylce Room";
		description = "A room filled with tiny clown bikes, a door, and a red clown nose on a pedestal.";
		
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
