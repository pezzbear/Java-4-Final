
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
		
		//Check if the crate is locked
		if (flag.GetFlag("crateIsLock")) {
			return "I've already opened the crate. Inside there is an outfit.";
		} else {
			flag.SetFlag("crateIsLock", true);
			return "Figure out how to open the crate. Inside there is an outfit.";
		}
	}
}
