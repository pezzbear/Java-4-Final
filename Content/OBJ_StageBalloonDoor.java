
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
