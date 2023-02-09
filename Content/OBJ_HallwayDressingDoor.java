
public class OBJ_HallwayDressingDoor extends Object {

	//@Override initObject() - add details about object
	@Override
	public void initObject() {
		title = "Door";
		description = "It Opens.";
		canPickup = false;
		canWalkThrough = true;
		
		//add connecting rooms
		connectingRooms[0] = "dressingRoom";
		connectingRooms[1] = "hallway";
	}
}
