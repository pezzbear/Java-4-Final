
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
