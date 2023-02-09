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
			//This SetFlag may be incorrect
			//Emily
			flag.SetFlag("stageExitDoorIsLock", false);
			
			//return if door is unlocked
			return "You danced just like a clown!";
		} else {
			
			//return if door is locked
			return "You're not acting the part. You may not exit yet.";
		}
		
	}
}
