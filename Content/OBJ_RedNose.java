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
	
	//@Override Use()
	@Override
	public String Use() {
		//Get and set the flags
		if (flag.GetFlag("hasRedNose")) {
			flag.SetFlag("stageExitDoorIsLock", false);		
			//return if door is unlocked
			return "You look amazingly like a clown! Please find your way to the nearest exit.";
		} else {			
			//return if door is locked
			return "You're not acting the part. You may not exit yet.";
		}
		
	}
	
	//@Override Pickup() to add the outfit to the objects
	@Override
	public String Pickup() { 
		String outputString = "You picked up the " + title;
		flag.SetFlag("stageExitDoorIsLock", false);
		inv.AddItem(this);
		rController.currentRoom.objectsSouth[0] = null;
		
		return outputString;
	}
}
