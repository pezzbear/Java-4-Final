
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
			return "You open up the cage. Inside there is a makeup kit.";
		}
		
	}
}
