//Utilize singleton design pattern to create RM_BalloonRoom
public class RM_BalloonRoom extends Room{
	
	//Create new instance of RM_BalloonRoom
	//Chapter 1- #6 Proper use of the Final Keyword.
	private static final RM_BalloonRoom instance = new RM_BalloonRoom();

	//Create a constructor of the RM_BalloonRoom class
	private RM_BalloonRoom() {
		InitRoom();
	}
	
	//Create GetInstance() to return instance of RM_BalloonRoom
	//Chapter 1- #5 Proper use of the Static Keyword.
	public static RM_BalloonRoom GetInstance() {
		return instance;
	}
	
	@Override
	public void InitRoom() {
		title = "Balloon Room";
		description = "It's filled to the ceiling with balloons! Inside there is a lever to open a room,"
				+ "a button that opens a locked crate, which is also hidden in this room. There is also a door."; 
		
		//Add button to the north side of the room
		objectsNorth = new Object[1];
		objectsNorth[0] = new OBJ_Button();
		
		//Add Crate and Outfit object to the room
		objectsEast = new Object[2];
		objectsEast[0] = new OBJ_Crate();
		objectsEast[1] = new OBJ_Outfit();
		
		//Add the lever to the room 
		objectsWest = new Object[1];
		objectsWest[0] = new OBJ_Lever();
		
		//Add Stage room door to Balloon Room
		objectsSouth = new Object[1];
		objectsSouth[0] = new OBJ_StageBalloonDoor();
	}
}
