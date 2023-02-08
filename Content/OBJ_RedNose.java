//Create class OBJ_RedNose which extends the Object class
public class OBJ_RedNose extends Object{

	//@Override initObject() - add details about object
	@Override
	public void initObject() {
		title = "Nose";
		description = "It's a squeaky, red, clown nose.";
		canPickup = true;
		canWalkThrough = false;
	}
	
	//Did not change this yet-don't know what to set flag.GetFlag to or if I should make one in the FlagController
	//Emily
	//Test comment
	@Override
	public String Use() {
		if (flag.GetFlag("hasMakupOn")) {
			return "The Mirror seems to recognize you. You hear a clicking sound";
		} else {
			return "You see your reflection in the Mirror. Maybe I have to change my appearance.";
		}
		
	}
}
