/*
 * Defines the room controller that is used to control the what room the player is in and what objects are currently accessible to the player 
 * depending on where they are in the room. (north, south, east, and west)
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RoomController { 
	
	private static final RoomController instance = new RoomController();
	
	private RoomController() {
	}
	
	public static RoomController GetInstance() {
		return instance;
	}
	
	private HashMap<String, Room> rooms = new HashMap<String, Room>();
	
	// Defines the current room the player is in
	public Room currentRoom = rooms.get("dressingRoom"); 
	
	// Defines the current location of the room they are in. (north, south, east, and west)
	public Location currentLocation = Location.north; 
	
	// Defines a list of the objects that the player can interact with at a given time.
	// For example if they are in the north side of a room they can only interact with 
	// the objects in the north of the room
	private List<Object> currentObjects = new ArrayList<Object>(); 
	
	//Adds all of the rooms in the game to a "rooms" dictionary. You set the rooms in the Doors by using these tags
	public synchronized void RoomControllerTags() {
		rooms.put("dressingRoom", RM_DressingRoom.GetInstance());
		rooms.put("hallway", RM_Hallway.GetInstance());
		rooms.put("balloonRoom", RM_BalloonRoom.GetInstance());
		rooms.put("bicycleRoom", RM_BicycleRoom.GetInstance());
		rooms.put("stageRoom", RM_StageRoom.GetInstance());
		rooms.put("storageRoom", RM_StorageRoom.GetInstance());
		rooms.put("exitRoom", RM_ExitRoom.GetInstance());
	}
	
	// Updates the current objects the player can interact with. 
	// This should be called each time the player moves to a different room / location 
	private synchronized void UpdateCurrentObjects() { 	
		currentObjects.clear();
		switch(currentLocation) {
		case north :
			if (currentRoom.objectsNorth != null) {
				for (Object object : currentRoom.objectsNorth) {
					currentObjects.add(object);
				}
			}
			break;
		case south :
			if (currentRoom.objectsSouth != null) {
				for (Object object : currentRoom.objectsSouth) {
					currentObjects.add(object);
				}
			}
			break;
		case east :
			if (currentRoom.objectsEast != null) {
				for (Object object : currentRoom.objectsEast) {
					currentObjects.add(object);
				}
			}
			break;
		case west :
			if (currentRoom.objectsWest != null) {
				for (Object object : currentRoom.objectsWest) {
					currentObjects.add(object);
				}
			}
			break;
		}
	}
	

	  /**
	   * Moves the player to location of room
	   * Based on direction they picked
	   */	
	public synchronized String move(Location location) { 
		String outputString = "";
		switch(location) {
		
		//User moves north
		case north :
			
			//If they're already north, output message
			if (currentLocation == location) {
				outputString = "I'm already in the north side of the room.";
				
			//else move north
			} else {
				outputString = "You move to the north side of the room.";
			}
			break;
		
		//User moves south
		case south :
			
			//If they're already south, output message
			if (currentLocation == location) {
				outputString = "I'm already in the south side of the room.";
				
			//else move south	
			} else {
				outputString = "You move to the south side of the room.";
			}
			break;
			
		//User moves east	
		case east :
			
			//If they're already east, output message
			if (currentLocation == location) {
				outputString = "I'm already in the east side of the room.";
				
			//Else move east	
			} else {
				outputString = "You move to the east side of the room.";
			}
			break;
			
		//User moves west	
		case west :
			
			//If they're already there, output message
			if (currentLocation == location) {
				outputString = "I'm already in the west side of the room.";
				
			//Else move west	
			} else {
				outputString = "You move to the west side of the room.";
			}
			break;
		}
		
		//Update user current location and output message
		currentLocation = location;
		UpdateCurrentObjects();
		return outputString;
	}
	
	  /**
	   * Returns where each object is in the room and holds their location
	   * Chapter 6 #1 - Uses try-catch
	   */
	public synchronized String look(Location location) { 
		String outputString = "";
		switch(location) {
		
		//Return objects in the north side of the room
		case north :
			try {
				outputString = "In the north side of the room you see a ";
				for(int i = 0; i < currentRoom.objectsNorth.length; i++) {
					Object object = currentRoom.objectsNorth[i];
					if(i == currentRoom.objectsNorth.length) {
						outputString += object.title + ", ";
					} else {
						outputString += object.title + ".";
					}
				}
			} catch (Exception e) {
				outputString = "You don't see anything in the north side of the room.";
			}
			break;
			
		//Return objects in the south side of the room	
		case south :
			try {
				outputString = "In the south side of the room you see a ";
				for(int i = 0; i < currentRoom.objectsSouth.length; i++) {
					Object object = currentRoom.objectsSouth[i];
					
					if(i == currentRoom.objectsSouth.length) {
						outputString += object.title + ", ";
					} else {
						outputString += object.title + ".";
					}
				}
			} catch (Exception e) {
				outputString = "You don't see anything in the south side of the room.";
			}
			break;
			
		//Return objects in the east side of the room		
		case east :
			try {
				outputString = "In the east side of the room you see a ";
				for(int i = 0; i < currentRoom.objectsEast.length; i++) {
					Object object = currentRoom.objectsEast[i];
					if(i == currentRoom.objectsEast.length) {
						outputString += object.title + ", ";
					} else {
						outputString += object.title + ".";
					}
				}
			} catch (Exception e) {
				outputString = "You don't see anything in the east side of the room.";
			}
			break;
			
		//Return objects in the west side of the room	
		case west :
			try {
				outputString = "In the west side of the room you see a ";
				for(int i = 0; i < currentRoom.objectsWest.length; i++) {
					Object object = currentRoom.objectsWest[i];
					if(i == currentRoom.objectsWest.length) {
						outputString += object.title + ", ";
					} else {
						outputString += object.title + ".";
					}
				}
			} catch (Exception e) {
				outputString = "You don't see anything in the west side of the room.";
			}
			break;
		}
		return outputString;
	}
	
	// Returns the objects the player can interact with in the current location of the current room they are in. 
	public synchronized List<Object> getCurrentObjects() { 
		return currentObjects;
	}
	
	  /**
	   * Moves the player to change rooms
	   * gets items in new room
	   */	
	public synchronized void ChangeRoom(String key) {
		currentRoom = GetRoom(key);
		UpdateCurrentObjects();
	}
	
	  /**
	   * Gets the room the user is in
	   */	
	public synchronized Room GetRoom(String key) {
		return rooms.get(key);
	}

	  /**
	   *Sets the new user location
	   *based on the direction they chose
	   */	
	public synchronized void SetLocation() {
		switch(currentLocation) {
		case north :
			currentLocation = Location.south;
			break;
		case south :
			currentLocation = Location.north;
			break;
		case east :
			currentLocation = Location.west;
			break;
		case west :
			currentLocation = Location.east;
			break;
		}
	}

	
}
