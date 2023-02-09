/*
 * Defines an "Object" in our game. Each object will have a title, attached adjectives, and other objects that can be liked to it.
 * Each object will have functions for when it is being called by the text handler. 
 * 
 * Example object: Table. 
 * The title would be "Table"
 * The linkedObjects could include a Bottle object with its own properties
 * 
 */
public abstract class Object {
	
	public Object() {
		initObject();
	}
	
	// Main name that is used for "calling" the noun. Example: "Table" 
	public String title; 
	
	//Description of the item for when the player "looks" at the item.
	public String description; 

	//If the object is an item that can be picked up
	public boolean canPickup = false;
	
	//If the object is an item that can be walked through
	public boolean canWalkThrough = false;
	
	public String[] connectingRooms = new String[2];

	public RoomController rController = RoomController.GetInstance();
	
	public FlagController flag = FlagController.GetInstance();
	
	public PlayerInventory inv = PlayerInventory.GetInstance();
	
	// Initializes the object. Sets the Title, Adjectives, and the text for each verb that needs to be used.
	public abstract void initObject(); 
	
	
	// All of the methods below are default "Verb" methods. They are called when a verb modifying a certain Object.
	
	public String Look() {
		String outputString = description;
		
		return outputString;
	}
	
	public String Pickup() { // You'll have to Override this functions in order to add flag checks! 
		String outputString = "You picked up the " + title;
		
		return outputString;
	}
	
	public String Use() { // You'll have to Override this functions in order to add flag checks! 
		String outputString = "You used the" + title;

		return outputString;
	}
	
	public String WalkThrough() {
		String outputString = "You walk through the " + title;
		if (rController.GetRoom(connectingRooms[0]) == rController.currentRoom) {
			rController.ChangeRoom(connectingRooms[1]);
		} else {
			rController.ChangeRoom(connectingRooms[0]);
		}
		rController.SetLocation();
		
		outputString = outputString + "\r The room around you looks like " + rController.currentRoom.description;
		
		return outputString;
	}
	
	
}
