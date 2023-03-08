/**
 * Class that holds the StageExitDoor object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The StageExitDoor object unlocks if the user collects all clown items and looks like a clown
 * 
 */
public class OBJ_StageExitDoor extends Object{
	
	//@Override initObject() - add details about object
	@Override
	public void initObject() {
		title = "Door";
		description = "It Opens once unlocked.";
		canPickup = false;
		canWalkThrough = true;
		
		//Add connecting rooms
		connectingRooms[0] = "stageRoom";
		connectingRooms[1] = "exitRoom";
	}
	
	//Override WalkThrough()
	@Override
	public String WalkThrough() {
		String outputString = "";
		
		//Check if the door is locked or unlocked and send location and description of room
		if(!flag.GetFlag("stageExitDoorIsLock")) {
			if (rController.GetRoom(connectingRooms[0]) == rController.currentRoom) {
				rController.ChangeRoom(connectingRooms[1]);
			} else {
				rController.ChangeRoom(connectingRooms[0]);
			}
			rController.SetLocation();
			
			Escaped escaped = new Escaped();
			
			flag.SetFlag("gameIsWon", true);
			
			escaped.escapeTitle();
	
		} else {
			outputString = "The Door seems to be locked";
		}
		
		return outputString;
	}
}
