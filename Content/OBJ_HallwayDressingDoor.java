/**
 * Class that holds the HallwayDressingDoor object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The HallwayDressingDoor object opens to the dressing room and hallway
 * 
 */
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
