/**
 * Class that holds the Outfit object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The Outfit object allows the user to continue their mission on looking like a clown and eventually exit the game
 * 
 */
public class OBJ_Outfit extends Object{

	//@Override initObject() - add details about object
	@Override
	public void initObject() {
		title = "Outfit";
		description = "Its a white, frilly, clown outfit.";
		canPickup = true;
		canWalkThrough = false;
	}
	
	//@Override Use() to see if the user has unlocked the crate before getting the outfit
	@Override
	public String Use() {
		if (flag.GetFlag("buttonIsPushed")) {
			if (!flag.GetFlag("crateIsLock")) {
				flag.SetFlag("crateisLock", true);
				flag.SetFlag("hasOutfit", true);
				return "You put the clown outfit on.";
			} else {
				return "I already have the outfit on.";
			}
		} else {
			return "I have to unlock the crate first.";
		}
	}
	
	//@Override Pickup() to add the outfit to the objects
	@Override
	public String Pickup() { 
		String outputString = "You picked up the " + title;
		flag.SetFlag("crateisLock", true);
		inv.AddItem(this);
		rController.currentRoom.objectsEast[1] = null;
		
		return outputString;
	}
}
