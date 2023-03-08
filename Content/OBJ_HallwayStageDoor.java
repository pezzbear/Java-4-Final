/**
 * Class that holds the HallwayStageDoor object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The HallwayStageDoor object unlocks if the user is wearing makeup in front of the mirror
 * It connects to the Stage room and the Hallway
 * 
 */
public class OBJ_HallwayStageDoor extends Object{

	//@Override initObject() - add details about object
	@Override
	public void initObject() {
		title = "Door";
		description = "It Opens.";
		canPickup = false;
		canWalkThrough = true;
		connectingRooms[0] = "stageRoom";
		connectingRooms[1] = "hallway";
	}
	
	//@override WalkThrough() to check if exit is locked or unlocked
	//Chapter 1- #9 Proper use of @Override notation.
	@Override
	public String WalkThrough() {
		String outputString = "";
		if(!flag.GetFlag("hallwayStageDoorIsLock")) {
			outputString = "You walk through the " + title;
			if (rController.GetRoom(connectingRooms[0]) == rController.currentRoom) {
				rController.ChangeRoom(connectingRooms[1]);
			} else {
				rController.ChangeRoom(connectingRooms[0]);
			}
			rController.SetLocation();
			
			outputString = outputString + "\r The room around you looks like " + rController.currentRoom.description;
		} else {
			outputString = "The Door seems to be locked";
		}
		
		return outputString;
	}
	
}
