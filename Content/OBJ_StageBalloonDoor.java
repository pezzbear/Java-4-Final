/**
 * Class that holds the StageBalloonDoor object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The StagBalloonDoor object connects to the balloon room and the stage room
 * 
 */
public class OBJ_StageBalloonDoor extends Object{
	
	//@Override initObject() - add details about object
	@Override
	public void initObject() {
		title = "Door";
		description = "It Opens.";
		canPickup = false;
		canWalkThrough = true;
		
		//Add connecting rooms
		connectingRooms[0] = "stageRoom";
		connectingRooms[1] = "balloonRoom";
	}
}
