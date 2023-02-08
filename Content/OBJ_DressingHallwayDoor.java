
public class OBJ_DressingHallwayDoor extends Object {

	@Override
	public void initObject() {
		title = "Door";
		description = "It Opens.";
		canPickup = false;
		canWalkThrough = false;
	}
	
	@Override
	public String Use() {
		if (flag.GetFlag("hasMakupOn")) {
			return "The Mirror seems to recognize you. You hear a clicking sound";
		} else {
			return "You see your reflection in the Mirror. Maybe I have to change my appearance.";
		}
		
	}
	
}
