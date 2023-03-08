/**
 * Class that holds the Cage object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The Cage object allows a user to get the makeup if it is open
 * 
 */
public class OBJ_Cage extends Object {
	
	@Override
	public void initObject() {
		title = "Cage";
		description = "Its a see through cage";
		canPickup = false;
		canWalkThrough = false;
	}
	
	@Override
	public String Use() {
		if (flag.GetFlag("cageIsOpen")) {
			return "I've already opened the cage. Inside there is a makeup kit.";
		} else {
			flag.SetFlag("cageIsOpen", true);
			return "You opened up the cage. Inside there is a makeup kit.";
		}
		
	}
}
