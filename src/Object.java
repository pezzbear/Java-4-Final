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
	

	  /**
	   * Default verb method for Look
	   * Returns a description
	   */	
	public String Look() {
		String outputString = description;
		
		return outputString;
	}
	
	  /**
	   * Default verb method for Pickup
	   * Returns a description
	   */
	public String Pickup() { 
		String outputString = "You picked up the " + title;
		
		return outputString;
	}
	
	  /**
	   * Default verb method for User
	   * Returns a description
	   */
	public String Use() { 
		String outputString = "You used the" + title;

		return outputString;
	}
	
	  /**
	   * Default verb method for WalkThrough
	   * Returns the current room the user is in
	   */
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
