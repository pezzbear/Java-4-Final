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
	
	public String LookNorth() {
		String outputString = "There is nothing north.";
		if(objectsNorth != null) {
			String objectString = "";
			for(int i = 0; i < objectsNorth.length; i++) {
				Object getObject = objectsNorth[i];
				if (i == objectsNorth.length) {
					objectString = objectString + getObject.title + ".";
				} else {
					objectString = objectString + getObject.title + ", ";
				}
				
			}
			
			outputString = "There is a " + objectString;
		}
		
		return outputString;
	}
	
	public String LookSouth() {
		String outputString = "There is nothing south.";
		
		if(objectsSouth != null) {
			String objectString = "";
			for(int i = 0; i < objectsSouth.length; i++) {
				Object getObject = objectsSouth[i];
				if (i == objectsSouth.length) {
					objectString = objectString + getObject.title + ".";
				} else {
					objectString = objectString + getObject.title + ", ";
				}
				
			}
			
			outputString = "There is a " + objectString;
		}
		
		return outputString;
	}
	
	public String LookEast() {
		String outputString = "There is nothing east.";
		
		if(objectsEast != null) {
			String objectString = "";
			for(int i = 0; i < objectsEast.length; i++) {
				Object getObject = objectsEast[i];
				if (i == objectsEast.length) {
					objectString = objectString + getObject.title + ".";
				} else {
					objectString = objectString + getObject.title + ", ";
				}
				
			}
			
			outputString = "There is a " + objectString;
		}
		
		return outputString;
	}
	
	public String LookWest() {
		String outputString = "There is nothing west.";
		
		if(objectsWest != null) {
			String objectString = "";
			for(int i = 0; i < objectsWest.length; i++) {
				Object getObject = objectsWest[i];
				if (i == objectsWest.length) {
					objectString = objectString + getObject.title + ".";
				} else {
					objectString = objectString + getObject.title + ", ";
				}
				
			}
			
			outputString = "There is a " + objectString;
		}
		
		return outputString;
	}
	
	public String Examine() {
		return description;
	}
}
