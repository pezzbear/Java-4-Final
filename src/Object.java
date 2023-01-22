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
	
	public String title; // Main name that is used for "calling" the noun. Example: "Table" 
	
	public String description; //Description of the item for when the player "looks" at the item.
	
	public boolean canPickup = false;
	
	public abstract void initObject(); // Initializes the object. Sets the Title, Adjectives, and the text for each verb that needs to be used.
	
	// All of the methods below are default "Verb" methods. They are called when a verb modifying a certain Object.
	
	public String Look() {
		String outputString = description;
		
		return outputString;
	}
	
	public String Pickup() {
		String outputString = "You picked up the " + title;
		
		return outputString;
	}
	
	public String Use() {
		String outputString = "You used the " + title;

		return outputString;
	}
	
	
}
