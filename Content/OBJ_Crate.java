/**
 * Class that holds the Crate object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The Crate object unlocks if the button is pushed so the user can get the outfit
 * 
 */
public class OBJ_Crate extends Object{
	
	//@Override initObject() - add details about object
	@Override
	public void initObject() {
		title = "Crate";
		description = "It Opens once unlocked.";
		canPickup = false;
		canWalkThrough = false;
	}
	
	//@Overide Use()
	@Override
	public String Use() {
		if (flag.GetFlag("buttonIsPushed")) {
			flag.SetFlag("crateIsLock", false);
			return "You unlocked the crate! Take the clown outfit.";
		} else {
			return "You need to push the button. Go find it!";
		}
		
	}
}
