/**
 * Class that holds the Nose object 
 * Holds if it can be picked up and/or walked through
 * Holds an @Override method for if object is used
 * The Nose object allows the user to exit the game
 * 
 */
public class OBJ_RedNose extends Object{

	//@Override initObject() - add details about object
	@Override
	public void initObject() {
		title = "Nose";
		description = "It's a squeaky, red, clown nose.";
		canPickup = true;
		canWalkThrough = false;
	}
	
	
	@Override
	public String Use() {
		if (flag.GetFlag("hasRedNose")) {
				flag.SetFlag("stageExitDoorIsLock", false);
				return "You look amazingly like a clown! Please find your way to the nearest exit.";
			} else {
				return "Are you sure you picked up the nose?";
			}
		} 
	
	//@Override Pickup() to add the outfit to the objects
	@Override
	public String Pickup() { 
		if (flag.GetFlag("hasOutfit")) {
		String outputString = "You picked up the " + title;
		flag.SetFlag("hasRedNose", true);
		flag.SetFlag("stageExitDoorIsLock", false);
		inv.AddItem(this);
		rController.currentRoom.objectsSouth[0] = null;
		
		return outputString;
	}else {
		flag.SetFlag("hasRedNose", false);
		flag.SetFlag("stageExitDoorIsLock", true);
		return "You don't look enough like a clown. Did you put on your outfit yet?";
	}
  }
}
