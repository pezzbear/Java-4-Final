
public class OBJ_Button extends Object{
	
	@Override
	public void initObject() {
		title = "Button";
		description = "Push the button to open the locked crate.";
		canPickup = false;
		canWalkThrough = false;
	}
	
	@Override
	public String Use() {
		if (flag.GetFlag("buttonIsPushed")) {
			flag.SetFlag("crateIsLock", false);
			return "The button was pushed. You unlocked the crate!";
		} else {
			return "You need to push the button.";
		}
		
	}
}
