
public class OBJ_MakeupKit extends Object{
	@Override
	public void initObject() {
		title = "Makeup";
		description = "It's a clown makeup kit";
		canPickup = false;
		canWalkThrough = false;
	}
	
	@Override
	public String Use() {
		if (flag.GetFlag("hasMakeup")) {
			if (!flag.GetFlag("hasMakupOn")) {
				flag.SetFlag("hasMakupOn", true);
				return "You apply the makeup to your face.";
			} else {
				return "I already have the makeup on my face.";
			}
		} else {
			return "I have to pick up the makeup kit first.";
		}
	}
	
	@Override
	public String Pickup() { 
		String outputString = "You picked up the " + title;
		flag.SetFlag("hasMakeup", true);
		inv.AddItem(this);
		rController.currentRoom.objectsNorth[1] = null;
		
		return outputString;
	}
}
