/**
 * Class that holds the Bicycle Room  
 * Holds all objects in this room
 * 
 */
public class RM_BicycleRoom extends Room{
	
	//Create a new instance of RM_BicycleRoom
	//Chapter 1- #6 Proper use of the Final Keyword.
	private static final RM_BicycleRoom instance = new RM_BicycleRoom();

	//Create a constructor of the RM_BicycleRoom class
	private RM_BicycleRoom() {
		InitRoom();
	}
		
	//Create GetInstance() to return instance of RM_BicycleRoom
	//Chapter 1- #5 Proper use of the Static Keyword.
	public static RM_BicycleRoom GetInstance() {
		return instance;
	}
	
	@Override
	public void InitRoom() {
		title = "Bicylce Room";
		description = "A room filled with tiny clown bikes, a door, and a red clown nose on a pedestal.";
		
		//Add red nose to the room
		objectsSouth = new Object[1];
		objectsSouth[0] = new OBJ_RedNose();
		
		//Add stage bicycle room door to bicycle room
		objectsWest = new Object[1];
		objectsWest[0] = new OBJ_StageBicycleDoor();
	}
}
