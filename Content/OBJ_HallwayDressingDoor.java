
public class OBJ_HallwayDressingDoor extends Object {

	@Override
	public void initObject() {
		title = "Door";
		description = "It Opens.";
		canPickup = false;
		canWalkThrough = true;
		connectingRooms[0] = "dressingRoom";
		connectingRooms[1] = "hallway";
	}
}
