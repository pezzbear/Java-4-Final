
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
