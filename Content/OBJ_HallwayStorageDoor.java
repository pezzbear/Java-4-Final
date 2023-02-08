
public class OBJ_HallwayStorageDoor extends Object {

	//@Override initObject() - add details about object
	@Override
	public void initObject() {
		title = "Door";
		description = "It Opens.";
		canPickup = false;
		canWalkThrough = true;
		
		//NEED TO ADD THE 2 ROOMS THIS DOOR CONNECTS TO, TO THE CONNECTING ROOMS ARRAY.
	}
}
