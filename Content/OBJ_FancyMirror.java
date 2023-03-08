
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
