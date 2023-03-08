/**
 * Class that holds the Lever object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The Lever object unlocks the StageBicycleDoor if it is pulled
 * 
 */
public class OBJ_Lever extends Object{
	@Override
	public void initObject() {
		title = "Lever";
		description = "Pull the lever to open the Bicycle Room!";
		canPickup = false;
		canWalkThrough = false;
	}
	
	@Override
	public String Use() {
		if (flag.GetFlag("leverIsPulled")) {
			flag.SetFlag("stageBicycleDoorIsLock", false);
			return "The lever was pulled. You unlocked the door to the Bicycle Room!";
		} else {
			return "You need to pull the lever.";
		}
		
	}
}
