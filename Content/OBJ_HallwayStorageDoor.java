
public class OBJ_HallwayStorageDoor extends Object {

	//@Override initObject() - add details about object
	@Override
	public void initObject() {
		title = "Door";
		description = "It Opens.";
		canPickup = false;
		canWalkThrough = true;
		connectingRooms[0] = "storageRoom";
		connectingRooms[1] = "hallway";
	}
}
