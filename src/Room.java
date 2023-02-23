/*
 * Defines the abstract class of each of the rooms that we are creating. 
 * Example room: 
 * Dining room 
 * -- Has object "WoodenTable" on the North side of the room
 * -- Has object "Wooden Door" on the South Side of the room
 */

public abstract class Room {
	
	//Title of the room. 
	public String title;
	
	//Description of the item for when the player enters the room.
	public String description; 
	
	// Defines all of the objects in the north side of the room
	public Object[] objectsNorth; 
	
	// Defines all of the objects in the north side of the room
	public Object[] objectsSouth; 
	
	// Defines all of the objects in the north side of the room
	public Object[] objectsEast; 
	
	// Defines all of the objects in the north side of the room
	public Object[] objectsWest;  
	
	// Initiates the room data like title, description, and the objects in the room
	public abstract void InitRoom();
	
	public RoomController rController = RoomController.GetInstance();
	
	public String Examine() {
		return description;
	}
}
