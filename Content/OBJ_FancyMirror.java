/**
 * Class that holds the Mirror object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The Mirror object unlocks the hallwayStageRoomDoor if the user is wearing the clown makeup
 * 
 */
public class OBJ_FancyMirror extends Object {
	
	@Override
	public void initObject() {
		title = "Mirror";
		description = "Its a fancy looking mirror.";
		canPickup = false;
		canWalkThrough = false;
	}
	
	@Override
	public String Use() {
		if (flag.GetFlag("hasMakupOn")) {
			flag.SetFlag("hallwayStageDoorIsLock", false);
			return "The Mirror seems to recognize you. You hear a clicking sound";
		} else {
			return "You see your reflection in the Mirror. "
					+ "Maybe I have to change my appearance by using an item. Type use + (item name)";
		}
		
	}
	
}
