/*
 * Defines the room controller that is used to control the what room the player is in and what objects are currently accessible to the player 
 * depending on where they are in the room. (north, south, east, and west)
 */

import java.util.ArrayList;
import java.util.List;

public class RoomController {
	
	public Room currentRoom; // Defines the current room the player is in
	
	public Location currentLocation; // Defines the current location of the room they are in. (north, south, east, and west)
	
	private List<Object> currentObjects = new ArrayList<Object>(); // Defines a list of the objects that the player can interact with at a given time.
																// For example if they are in the north side of a room they can only interact with 
																// the objects in the north of the room
	
	private void UpdateCurrentObjects() { 	// Updates the current objects the player can interact with. 
											// This should be called each time the player moves to a different room / location 
		
		currentObjects.clear();
		switch(currentLocation) {
		case north :
			if (currentRoom.objectsNorth.length != 0) {
				for (Object object : currentRoom.objectsNorth) {
					currentObjects.add(object);
				}
			}
			break;
		case south :
			if (currentRoom.objectsSouth.length != 0) {
				for (Object object : currentRoom.objectsNorth) {
					currentObjects.add(object);
				}
			}
			break;
		case east :
			if (currentRoom.objectsEast.length != 0) {
				for (Object object : currentRoom.objectsNorth) {
					currentObjects.add(object);
				}
			}
			break;
		case west :
			if (currentRoom.objectsWest.length != 0) {
				for (Object object : currentRoom.objectsNorth) {
					currentObjects.add(object);
				}
			}
			break;
		}
	}
	
	public String move(Location location) { // Moves the player to the desired location of the room
		String outputString = "";
		switch(location) {
		case north :
			if (currentLocation == location) {
				outputString = "I'm already in the north side of the room.";
			} else {
				outputString = "You move to the north side of the room.";
			}
			break;
		case south :
			if (currentLocation == location) {
				outputString = "I'm already in the south side of the room.";
			} else {
				outputString = "You move to the south side of the room.";
			}
			break;
		case east :
			if (currentLocation == location) {
				outputString = "I'm already in the east side of the room.";
			} else {
				outputString = "You move to the east side of the room.";
			}
			break;
		case west :
			if (currentLocation == location) {
				outputString = "I'm already in the west side of the room.";
			} else {
				outputString = "You move to the west side of the room.";
			}
			break;
		}
		currentLocation = location;
		UpdateCurrentObjects();
		return outputString;
	}
	
	public String look(Location location) {
		String outputString = "";
		switch(location) {
		case north :
			if( currentRoom.objectsNorth.length != 0) {
				outputString = "In the north side of the room you see ";
				for(int i = 0; i < currentRoom.objectsNorth.length; i++) {
					Object object = currentRoom.objectsNorth[i];
					if(i < currentRoom.objectsNorth.length) {
						outputString += object.title + ", ";
					} else {
						outputString += object.title + ".";
					}
				}
			} else {
				outputString = "You don't see anything in the north side of the room.";
			}
			break;
		case south :
			if( currentRoom.objectsSouth.length != 0) {
				outputString = "In the north side of the room you see ";
				for(int i = 0; i < currentRoom.objectsSouth.length; i++) {
					Object object = currentRoom.objectsSouth[i];
					if(i < currentRoom.objectsSouth.length) {
						outputString += object.title + ", ";
					} else {
						outputString += object.title + ".";
					}
				}
			} else {
				outputString = "You don't see anything in the north side of the room.";
			}
			break;
		case east :
			if( currentRoom.objectsEast.length != 0) {
				outputString = "In the north side of the room you see ";
				for(int i = 0; i < currentRoom.objectsEast.length; i++) {
					Object object = currentRoom.objectsEast[i];
					if(i < currentRoom.objectsEast.length) {
						outputString += object.title + ", ";
					} else {
						outputString += object.title + ".";
					}
				}
			} else {
				outputString = "You don't see anything in the north side of the room.";
			}
			break;
		case west :
			if( currentRoom.objectsWest.length != 0) {
				outputString = "In the north side of the room you see ";
				for(int i = 0; i < currentRoom.objectsWest.length; i++) {
					Object object = currentRoom.objectsWest[i];
					if(i < currentRoom.objectsWest.length) {
						outputString += object.title + ", ";
					} else {
						outputString += object.title + ".";
					}
				}
			} else {
				outputString = "You don't see anything in the north side of the room.";
			}
			break;
		}
		return outputString;
	}
	
	public List<Object> getCurrentObjects() {
		return currentObjects;
	}
	
}
