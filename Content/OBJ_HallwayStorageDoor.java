/**
 * Class that holds the HallwayStorageDoor object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The HallwayStorageDoor object opens to the Hallway and the Storage rooms
 * 
 */
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
